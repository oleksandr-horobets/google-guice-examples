package multibinding;

public class BeanB implements Bean {
    public BeanB(){
        System.out.println("Instantiating bean B");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello B");
    }
}
