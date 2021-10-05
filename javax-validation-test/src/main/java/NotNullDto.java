import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter @Setter
public class NotNullDto {
    
    @NotNull
    private String name;
}
