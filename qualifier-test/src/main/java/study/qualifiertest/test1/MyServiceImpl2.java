package study.qualifiertest.test1;

import org.springframework.stereotype.Service;

@Service("myService222")
public class MyServiceImpl2 implements MyService {

    @Override
    public String getName() {
        return "myService2";
    }
}
