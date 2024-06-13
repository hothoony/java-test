package com.example.maplisttest.List_test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListTest2 {

    private HashMap m_parameters = new HashMap() {{
        put("MANAGERSEQ", new HashMap() {{
            put("0", "aa");
            put("1", "bb");
            put("2", "aa");
        }});
    }};

    @Test
    void test1() {
        System.out.println("m_parameters = " + m_parameters);
        
        // 값을 넣은데로 출력
        List managerSeqList = getParameterValuesAsList("managerSeq");
        System.out.println("managerSeqList = " + managerSeqList);

        // 중복을 제거하고 출력
        HashSet hashSet = new HashSet<>(managerSeqList);
        managerSeqList.clear();
        managerSeqList.addAll(hashSet);
        System.out.println("managerSeqList = " + managerSeqList);
    }

    public List getParameterValuesAsList(String paramName) {
        Map paramNameMap = (Map) m_parameters.get(paramName.toUpperCase());
        Iterator<String> keys = paramNameMap.keySet().iterator();
        String[] paramNameAry = new String[paramNameMap.size()];
        while (keys.hasNext()) {
            String key = keys.next();
            String value = String.valueOf(paramNameMap.get(key));
            paramNameAry[Integer.parseInt(key)] = value;
        }
        List paramNameList = new ArrayList();
        for (int i = 0; i < paramNameAry.length; i++) {
            if (paramNameAry[i] != null && !"".equals(paramNameAry[i])) {
                paramNameList.add(paramNameAry[i]);
            }
        }
        return paramNameList;
    }
}
