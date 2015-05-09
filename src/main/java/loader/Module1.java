package loader;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.TypeLiteral;
import com.google.inject.matcher.Matchers;
import com.google.inject.spi.ProvisionListener;
import com.google.inject.spi.TypeEncounter;
import com.google.inject.spi.TypeListener;

public class Module1 implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(HeavyBean1.class).asEagerSingleton();
        binder.bind(HeavyBean2.class).asEagerSingleton();
        binder.bind(HeavyBean3.class).asEagerSingleton();

        binder.bindListener(Matchers.any(), new TypeListener() {
            @Override
            public <I> void hear(TypeLiteral<I> type, TypeEncounter<I> encounter) {
                System.out.println("hear: " + type + " encounter: " + encounter);
            }
        });

        binder.bindListener(Matchers.any(), new ProvisionListener() {
            @Override
            public <T> void onProvision(ProvisionInvocation<T> provision) {
                System.out.println("Before provision: " + provision);
                provision.provision();
                System.out.println("After provision: " + provision);
            }
        });


    }
}
