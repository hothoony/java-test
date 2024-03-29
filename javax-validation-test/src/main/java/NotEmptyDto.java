import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter @Setter
public class NotEmptyDto {
    
    @NotEmpty
    private String name;
}
