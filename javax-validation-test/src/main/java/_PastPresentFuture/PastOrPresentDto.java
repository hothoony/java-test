package _PastPresentFuture;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Data
@Builder
public class PastOrPresentDto implements PastPresentFutureDto {

    @PastOrPresent
    LocalDate localDate;

}
