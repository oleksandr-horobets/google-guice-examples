package properties;

import javax.inject.Inject;
import javax.inject.Named;

public class Bean {
    @Inject
    public Bean(@Named("foo") String foo, @Named("bar") int bar){
        System.out.println("Foo: " + foo);
        System.out.println("Bar: " + bar);
    }
}
