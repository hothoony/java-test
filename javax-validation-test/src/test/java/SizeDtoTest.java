import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SizeDtoTest {

    Validator validator;
    Set<ConstraintViolation<SizeDto>> vioations;

    @BeforeEach
    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void test() {
        SizeDto dto = new SizeDto();

        dto.setName(null);
        vioations = validator.validate(dto);
        assertEquals(0, vioations.size());

        dto.setName("");
        vioations = validator.validate(dto);
        assertEquals(1, vioations.size());

        dto.setName(" ");
        vioations = validator.validate(dto);
        assertEquals(1, vioations.size());

        dto.setName("1");
        vioations = validator.validate(dto);
        assertEquals(1, vioations.size());

        dto.setName("12");
        vioations = validator.validate(dto);
        assertEquals(1, vioations.size());

        dto.setName("123");
        vioations = validator.validate(dto);
        assertEquals(0, vioations.size());

        dto.setName("1234");
        vioations = validator.validate(dto);
        assertEquals(1, vioations.size());
    }
}
