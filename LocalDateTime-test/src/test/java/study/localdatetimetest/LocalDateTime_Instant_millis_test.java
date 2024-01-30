package study.localdatetimetest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;

public class LocalDateTime_Instant_millis_test {

    @Test
    void Instant_epoch_now() {

        // UTC 기준 시간
        // 1970-01-01T00:00:00Z
        Instant epoch = Instant.EPOCH;
        System.out.println("epoch = " + epoch);

        // UTC 현재 시간
        // 2024-01-30T01:13:34.437535Z
        Instant now = Instant.now();
        System.out.println("  now = " + now);
    }

    @DisplayName("Instant 와 LocalDateTime 비교")
    @Test
    void Instant_LocalDateTime_test() {
        
        // Instant 와 LocalDateTime 은 timezone 이 다름

        // Instant 는 UTC
        Instant now = Instant.now();
        System.out.println("      Instant now = " + now);

        // LocalDateTime 은 Asia/Seoul
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime now = " + localDateTime);
    }

    @Test
    void test1() {

        Instant epoch = Instant.EPOCH;
        System.out.println("epoch = " + epoch);

        long epochMilli = epoch.toEpochMilli();
        System.out.println("epochMilli = " + epochMilli);

        Instant now = Instant.now();
        System.out.println("now = " + now);

        long epochMilli1 = now.toEpochMilli();
        System.out.println("epochMilli1 = " + epochMilli1);

        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
    }

    @Test
    void TimeZone_test() {

        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("timeZone = " + timeZone);
        ZoneId zoneId = timeZone.toZoneId();
        System.out.println("zoneId = " + zoneId);
    }

    @Test
    void ZoneId_test() {

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);
        ZoneOffset zoneOffset = zoneId.getRules().getOffset(Instant.now());
        System.out.println("zoneOffset = " + zoneOffset);
    }

    @Test
    void LocalDateTime_toMillis() {

        LocalDateTime localDateTime = LocalDateTime.now();

        long epochMilli = localDateTimeToMillis(localDateTime);
        System.out.println("   epochMilli = " + epochMilli);

        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentMillis = " + currentTimeMillis);
    }

    private long localDateTimeToMillis(LocalDateTime localDateTime) {
        ZoneId zoneId = ZoneId.systemDefault();
        ZoneOffset zoneOffset = zoneId.getRules().getOffset(Instant.now());
        Instant instant = localDateTime.toInstant(zoneOffset);
        long epochMilli = instant.toEpochMilli();
        return epochMilli;
    }
}
