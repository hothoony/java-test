import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter @Setter
public class PatternDto {
    
    @Pattern(regexp = "[0-9]+")
    private String name;
}
