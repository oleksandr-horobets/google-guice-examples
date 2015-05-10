package multimodule;

import com.google.inject.Binder;
import com.google.inject.Module;

public class Module2 implements Module {
    @Override
    public void configure(Binder binder) {
        binder.install(new Module1());
        binder.bind(Bean2.class).asEagerSingleton();
    }
}
