package multimodule;

import com.google.inject.Binder;
import com.google.inject.Module;

public class Module1 implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bind(Bean1.class).asEagerSingleton();
    }
}
