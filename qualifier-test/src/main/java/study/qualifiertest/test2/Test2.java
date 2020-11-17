package study.qualifiertest.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Test2 {

    @Qualifier("myDto1")
    @Autowired
    private MyDto myDtoA;

    private final MyDto myDtoB;

    public Test2(@Qualifier("myDto222") MyDto myDtoB) {
        this.myDtoB = myDtoB;
    }

    public void test() {
        System.out.println("myDtoA.getName() = " + myDtoA.getName());
        System.out.println("myDtoB.getName() = " + myDtoB.getName());
    }
}
