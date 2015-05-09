package loader;

import javax.inject.Inject;

public class HeavyBean2 {

    @Inject
    public HeavyBean2(HeavyBean1 bean1) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Heavy Bean2 instantiated");
    }
}
