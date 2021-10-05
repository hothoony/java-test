package _PastPresentFuture;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Future;
import java.time.LocalDate;

@Data
@Builder
public class FutureDto implements PastPresentFutureDto {

    @Future
    LocalDate localDate;

}
