package util;

import _PastPresentFuture.PastPresentFutureDto;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class PastPresentFutureUtil {

    public static void hasError(PastPresentFutureDto dto, Validator validator) {
        Set<ConstraintViolation<PastPresentFutureDto>> vioations = validator.validate(dto);
        assertThat(vioations.size()).isEqualTo(1);
        printViolations(vioations);
    }

    public static void hasNoError(PastPresentFutureDto dto, Validator validator) {
        Set<ConstraintViolation<PastPresentFutureDto>> vioations = validator.validate(dto);
        assertThat(vioations.size()).isEqualTo(0);
        printViolations(vioations);
    }

    public static void printViolations(Set<ConstraintViolation<PastPresentFutureDto>> vioations) {
        for (ConstraintViolation<PastPresentFutureDto> vioation : vioations) {
            System.out.println(vioation.getMessage());
            System.out.println(vioation.getInvalidValue());
        }
    }
}
