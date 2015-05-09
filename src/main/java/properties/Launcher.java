package properties;

import com.google.common.io.ByteSource;
import com.google.common.io.Resources;
import com.google.inject.Guice;
import com.google.inject.name.Names;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class Launcher {
    public static void main(String[] args) {
        Guice.createInjector(binder -> {
            binder.bind(Bean.class).asEagerSingleton();
            Names.bindProperties(binder, getProperties());
        });
    }

    private static Properties getProperties() {
        URL url = Resources.getResource("config.properties");
        ByteSource inputSupplier = Resources.asByteSource(url);

        Properties properties = new Properties();

        try {
            properties.load(inputSupplier.openStream());

            return properties;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
