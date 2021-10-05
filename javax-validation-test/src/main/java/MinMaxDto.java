import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter @Setter
public class MinMaxDto {
    
    @Min(10)
    @Max(20)
    private int num;
}
