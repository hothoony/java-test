package _PastPresentFuture;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.FutureOrPresent;
import java.time.LocalDate;

@Data
@Builder
public class FutureOrPresentDto implements PastPresentFutureDto {

    @FutureOrPresent
    LocalDate localDate;
}
