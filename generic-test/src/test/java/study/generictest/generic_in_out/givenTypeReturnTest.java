package study.generictest.generic_in_out;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class givenTypeReturnTest {

    @Test
    void name() throws Exception {
        HashMap type = toType(HashMap.class);
        Map type1 = toType(Map.class);
    }

    public <T> T toType(Class<T> clazz) throws Exception {
        T t = clazz.getDeclaredConstructor().newInstance();
        return t;
    }
}
