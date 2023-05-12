package study.generictest.jpql;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class QueryResultMapper {

    public static <T> List<T> listTupleToDtos(List<Tuple> list, Class<T> clazz) {
        List<T> resultList = new ArrayList<>();
        
        try {
            for (int i = 0; i < 3; i++) {
                T instance = clazz.getDeclaredConstructor().newInstance();
                resultList.add(instance);
            }
        } catch (Exception e) {
        }
        
        return resultList;
    }

    public static List<Map<String, Object>> listTupleToMaps(List<Tuple> list) {
        List<Map<String, Object>> resultList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Map<String, Object> map = new HashMap<>();
            resultList.add(map);
        }

        return resultList;
    }
}
