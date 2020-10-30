import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Getter @Setter
@Builder
public class PastFutureDto {

    @Past
    LocalDate past;

    @PastOrPresent
    LocalDate pastOrPresent;

    @Future
    LocalDate future;

    @FutureOrPresent
    LocalDate futureOrPresent;
}
