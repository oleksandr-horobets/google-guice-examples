package loader;

import com.google.inject.spi.InjectionListener;

import javax.inject.Singleton;

@Singleton
public class Listener implements InjectionListener<HeavyBean2> {
    @Override
    public void afterInjection(HeavyBean2 injectee) {
        System.out.println("Injected: "  + injectee);
    }
}
