import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.*;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class NotBlankTest {

    Validator validator;
    Set<ConstraintViolation<NotBlankDto>> vioations;

    @BeforeEach
    void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void test() {
        NotBlankDto dto = new NotBlankDto();

        dto.setName(null);
        vioations = validator.validate(dto);
        assertEquals(1, vioations.size());

        dto.setName("");
        vioations = validator.validate(dto);
        assertEquals(1, vioations.size());

        dto.setName(" ");
        vioations = validator.validate(dto);
        assertEquals(1, vioations.size());
    }
}
