package loader;

import javax.inject.Inject;

public class HeavyBean3 {

    @Inject
    public HeavyBean3(HeavyBean2 bean2) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Heavy Bean3 instantiated");
    }
}
