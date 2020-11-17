package study.qualifiertest.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Test1 {

    @Qualifier("myService1")
    @Autowired
    private MyService myService1;

    private final MyService myService2;

    @Autowired
    private MyService myServiceImpl3;

    public Test1(@Qualifier("myService222") MyService myService2) {
        this.myService2 = myService2;
    }

    public void test() {
        System.out.println("myService1.getName() = " + myService1.getName());
        System.out.println("myService2.getName() = " + myService2.getName());
        System.out.println("myServiceImpl3.getName() = " + myServiceImpl3.getName());
    }

}
