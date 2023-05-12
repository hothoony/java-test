package study.generictest.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericClazz<T> { // HERE
    
    private T dto; // HERE
    private List<T> dtoList = new ArrayList<>();

    public void setDto(T dto) { // HERE
        this.dto = dto;
    }

    public T getDto() { // HERE
        return dto;
    }

    public void setDtoList(T dto) {
        dtoList.add(dto);
    }
    
    public List<T> getDtoList() {
        return dtoList;
    }
}
