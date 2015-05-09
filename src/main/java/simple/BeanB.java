package simple;

import javax.inject.Inject;

public class BeanB {
    private BeanA beanA;

    @Inject
    public BeanB(BeanA beanA){
        this.beanA = beanA;
    }

    public void hello(){
        System.out.println("Hello from BeanB");
        System.out.println(beanA);
    }
}
