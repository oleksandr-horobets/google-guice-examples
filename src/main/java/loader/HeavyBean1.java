package loader;

public class HeavyBean1 {

    public HeavyBean1() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Heavy Bean1 instantiated");
    }
}
