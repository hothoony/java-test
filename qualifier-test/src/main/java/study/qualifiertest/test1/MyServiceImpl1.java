package study.qualifiertest.test1;

import org.springframework.stereotype.Service;

@Service("myService1")
public class MyServiceImpl1 implements MyService {

    @Override
    public String getName() {
        return "myService1";
    }
}
