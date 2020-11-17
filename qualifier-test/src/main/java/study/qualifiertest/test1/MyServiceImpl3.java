package study.qualifiertest.test1;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl3 implements MyService {

    @Override
    public String getName() {
        return "myService3";
    }
}
