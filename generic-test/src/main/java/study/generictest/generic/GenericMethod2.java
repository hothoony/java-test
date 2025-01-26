package study.generictest.generic;

import study.generictest.dto.MemberDto;
import study.generictest.dto.TeamDto;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class GenericMethod2 {

    public <T> T getDto(String str, Class<T> clazz) {
        try {
            Constructor<T> constructor = clazz.getConstructor(String.class);
            return constructor.newInstance(str);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
    
    public <T> List<T> getDtoList(String str, Class<T> clazz) {
        List<T> list = new ArrayList<>();
        try {
            Constructor<T> constructor = clazz.getConstructor(String.class);
            T t = constructor.newInstance(str);
            list.add(t);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
