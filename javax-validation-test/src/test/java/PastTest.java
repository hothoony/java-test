import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.DateUtil;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class PastTest {

    Validator validator;
    Set<ConstraintViolation<PastFutureDto>> vioations;

    @BeforeEach
    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

//    @Test
//    void past_yesterday_ok() {
//        PastFutureDto dto = PastFutureDto.builder()
//                .past(DateUtil.getYesterday()).build();
//
//        hasNoError(dto);
//    }
//
//    @Test
//    void past_today_notOk() {
//        PastFutureDto dto = PastFutureDto.builder()
//                .past(DateUtil.getToday()).build();
//
//        hasError(dto);
//    }
//
//    @Test
//    void past_tomorrow_notOk() {
//        PastFutureDto dto = PastFutureDto.builder()
//                .past(DateUtil.getTomorrow()).build();
//
//        hasError(dto);
//    }

    @Test
    void pastOrPresent_yesterday_ok() {
        PastFutureDto dto = PastFutureDto.builder()
                .past(DateUtil.getYesterday()).build();

        hasNoError(dto);
    }

    @Test
    void pastOrPresent_today_ok() {
        PastFutureDto dto = PastFutureDto.builder()
                .past(DateUtil.getToday()).build();

        hasNoError(dto);
    }

    @Test
    void pastOrPresent_tomorrow_notOk() {
        PastFutureDto dto = PastFutureDto.builder()
                .past(DateUtil.getTomorrow()).build();

        hasError(dto);
    }

    private void hasError(PastFutureDto dto) {
        vioations = validator.validate(dto);
        assertThat(vioations.size()).isEqualTo(1);
        printViolations(vioations);
    }

    private void hasNoError(PastFutureDto dto) {
        vioations = validator.validate(dto);
        assertThat(vioations.size()).isEqualTo(0);
        printViolations(vioations);
    }

    private void printViolations(Set<ConstraintViolation<PastFutureDto>> vioations) {
        for (ConstraintViolation<PastFutureDto> vioation : vioations) {
            System.out.println(vioation.getMessage());
            System.out.println(vioation.getInvalidValue());
        }
    }

}
