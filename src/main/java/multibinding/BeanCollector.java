package multibinding;

import javax.inject.Inject;
import java.util.Set;

public class BeanCollector {

    @Inject
    public BeanCollector(Set<Bean> beanSet){
        beanSet.forEach(Bean::sayHello);
    }
}
