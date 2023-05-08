package study.localdatetimetest.ldt03_localdatetime;

import org.junit.jupiter.api.Test;
import study.localdatetimetest.utils.LocalDateTimeUtil;

import java.time.LocalDateTime;

import static study.localdatetimetest.utils.StringUtil.*;

public class weekday_weekend {

    @Test
    void weekday_weekend() {
        LocalDateTime localDateTime = LocalDateTime.of(2021, 3, 1, 0, 0);
        for (int i = 0; i < 7; i++) {
            System.out.print(localDateTime);
            System.out.print(" " + localDateTime.getDayOfWeek().getValue());
            System.out.print(" " + rpad(localDateTime.getDayOfWeek(), 9));
            System.out.print(" WEEKDAY=" + rpad(LocalDateTimeUtil.isWeekday(localDateTime), 5));
            System.out.print(" WEEKEND=" + rpad(LocalDateTimeUtil.isWeekend(localDateTime), 5));
            System.out.print(" WEEKEND=" + rpad(LocalDateTimeUtil.isWeekendByValue(localDateTime), 5));
            System.out.println();
            LocalDateTimeUtil.isWeekend(localDateTime);
            localDateTime = localDateTime.plusDays(1);
        }
    }

}
