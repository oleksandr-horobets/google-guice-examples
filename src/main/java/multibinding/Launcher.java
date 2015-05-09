package multibinding;

import com.google.inject.Guice;
import com.google.inject.multibindings.Multibinder;

public class Launcher {
    public static void main(String[] args) {
        Guice.createInjector(binder -> {

            binder.bind(BeanA.class).asEagerSingleton();
            binder.bind(BeanB.class).asEagerSingleton();
            binder.bind(BeanCollector.class).asEagerSingleton();

            final Multibinder<Bean> multibinder = Multibinder.newSetBinder(binder, Bean.class);

            multibinder.addBinding().to(BeanA.class);
            multibinder.addBinding().to(BeanB.class);
        });
    }
}
