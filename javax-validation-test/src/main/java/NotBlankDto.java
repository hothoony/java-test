import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
public class NotBlankDto {
    
    @NotBlank
    private String name;
}
