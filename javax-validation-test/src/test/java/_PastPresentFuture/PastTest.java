package _PastPresentFuture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.DateUtil;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import static util.PastPresentFutureUtil.hasError;
import static util.PastPresentFutureUtil.hasNoError;
import static org.assertj.core.api.Assertions.assertThat;

public class PastTest {

    Validator validator;

    @BeforeEach
    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void yesterday() {
        PastDto pastPresentFutureDto = PastDto.builder()
                .localDate(DateUtil.getYesterday())
                .build();
        System.out.println("pastPresentFutureDto = " + pastPresentFutureDto);

        hasNoError(pastPresentFutureDto, validator);
    }

    @Test
    void today() {
        PastDto pastPresentFutureDto = PastDto.builder()
                .localDate(DateUtil.getToday())
                .build();
        System.out.println("pastPresentFutureDto = " + pastPresentFutureDto);

        hasError(pastPresentFutureDto, validator);
    }

    @Test
    void tomorrow() {
        PastDto pastPresentFutureDto = PastDto.builder()
                .localDate(DateUtil.getTomorrow())
                .build();
        System.out.println("pastPresentFutureDto = " + pastPresentFutureDto);

        hasError(pastPresentFutureDto, validator);
    }

}
