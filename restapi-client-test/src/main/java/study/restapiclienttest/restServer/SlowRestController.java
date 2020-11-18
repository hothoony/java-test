package study.restapiclienttest.restServer;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SlowRestController {

    @PostMapping("/hello")
    public List<ResponseDto> hello() throws InterruptedException {
        Thread.sleep(5000);
        return Arrays.asList(
                new ResponseDto("name1", "msg1"),
                new ResponseDto("name2", "msg2"),
                new ResponseDto("name3", "msg3")
        );
    }

    @Data
    @AllArgsConstructor
    private class ResponseDto {
        private String name;
        private String message;
    }
}
