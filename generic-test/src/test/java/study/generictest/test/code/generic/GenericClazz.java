package study.generictest.test.code.generic;

public class GenericClazz<T> { // HERE
    
    private T dto; // HERE

    public void setDto(T dto) { // HERE
        this.dto = dto;
    }

    public T getDto() { // HERE
        return dto;
    }
}
