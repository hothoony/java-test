import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Getter @Setter
public class SizeDto {
    
    @Size(min = 3, max = 3)
    private String name;
}
