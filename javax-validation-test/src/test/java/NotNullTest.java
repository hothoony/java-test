import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotNullTest {

    Validator validator;
    Set<ConstraintViolation<NotNullDto>> vioations;

    @BeforeEach
    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void test() {
        NotNullDto dto = new NotNullDto();

        dto.setName(null);
        vioations = validator.validate(dto);
        assertEquals(1, vioations.size());

        dto.setName("");
        vioations = validator.validate(dto);
        assertEquals(0, vioations.size());

        dto.setName(" ");
        vioations = validator.validate(dto);
        assertEquals(0, vioations.size());
    }
}
