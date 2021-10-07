package study.validationutilstest.ValidationUtils_test;

import org.junit.jupiter.api.Test;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.ValidationUtils;
import study.validationutilstest.dto.MemberDto;

import static org.assertj.core.api.Assertions.assertThat;

public class rejectIfEmptyOrWhitespace {

    @Test
    void nulls() {
        MemberDto memberDto = new MemberDto(null);
        Errors errors = new BeanPropertyBindingResult(memberDto, "memberDto");
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "requiredMyField");

        assertThat(errors.hasErrors()).isTrue();
        checkErrors(errors);
    }

    @Test
    void empty() {
        MemberDto memberDto = new MemberDto("");
        Errors errors = new BeanPropertyBindingResult(memberDto, "memberDto");
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "requiredMyField");

        assertThat(errors.hasErrors()).isTrue();
        checkErrors(errors);
    }

    @Test
    void space() {
        MemberDto memberDto = new MemberDto(" ");
        Errors errors = new BeanPropertyBindingResult(memberDto, "memberDto");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "requiredMyField");

        assertThat(errors.hasErrors()).isTrue();
        checkErrors(errors);
    }

    private void checkErrors(Errors errors) {
        System.out.println("errors.getErrorCount() = " + errors.getErrorCount());
        if (errors.hasErrors()) {
            for (ObjectError allError : errors.getAllErrors()) {
                System.out.println("  >> allError = " + allError);
            }
        }
    }
}
