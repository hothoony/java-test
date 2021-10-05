package _PastPresentFuture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.DateUtil;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import static util.PastPresentFutureUtil.hasError;
import static util.PastPresentFutureUtil.hasNoError;

public class FutureOrPresentTest {

    Validator validator;

    @BeforeEach
    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void yesterday() {
        FutureOrPresentDto pastPresentFutureDto = FutureOrPresentDto.builder()
                .localDate(DateUtil.getYesterday())
                .build();
        System.out.println("pastPresentFutureDto = " + pastPresentFutureDto);

        hasError(pastPresentFutureDto, validator);
    }

    @Test
    void today() {
        FutureOrPresentDto pastPresentFutureDto = FutureOrPresentDto.builder()
                .localDate(DateUtil.getToday())
                .build();
        System.out.println("pastPresentFutureDto = " + pastPresentFutureDto);

        hasNoError(pastPresentFutureDto, validator);
    }

    @Test
    void tomorrow() {
        FutureOrPresentDto pastPresentFutureDto = FutureOrPresentDto.builder()
                .localDate(DateUtil.getTomorrow())
                .build();
        System.out.println("pastPresentFutureDto = " + pastPresentFutureDto);

        hasNoError(pastPresentFutureDto, validator);
    }

}
