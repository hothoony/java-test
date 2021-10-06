package _PastPresentFuture;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Past;
import java.time.LocalDate;

@Data
@Builder
public class PastDto implements PastPresentFutureDto {

    @Past
    LocalDate localDate;

}
