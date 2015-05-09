package multibinding;

public class BeanA implements Bean {
    public BeanA(){
        System.out.println("Instantiating bean A");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello A");
    }
}
