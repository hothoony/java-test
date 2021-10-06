import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxDtoTest {

    Validator validator;
    Set<ConstraintViolation<MinMaxDto>> vioations;

    @BeforeEach
    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void test() {
        MinMaxDto dto = new MinMaxDto();

        for (int i = 9; i < 21; i++) {
            dto.setNum(i);
            vioations = validator.validate(dto);
            if (i == 9 || i == 21) {
                assertEquals(1, vioations.size());
            } else {
                assertEquals(0, vioations.size());
            }
        }
    }
}
