import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class PatternDtoTest {

    Validator validator;
    Set<ConstraintViolation<PatternDto>> vioations;

    @BeforeEach
    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void test() {
        PatternDto dto = new PatternDto();

        dto.setName("1234567890");
        vioations = validator.validate(dto);
        assertEquals(0, vioations.size());

        dto.setName("");
        vioations = validator.validate(dto);
        assertEquals(1, vioations.size());

        dto.setName("abc");
        vioations = validator.validate(dto);
        assertEquals(1, vioations.size());
    }
}
