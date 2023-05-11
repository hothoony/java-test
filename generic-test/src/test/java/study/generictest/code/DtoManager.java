package study.generictest.code;

public class DtoManager<T> { // HERE
    
    private T dto; // HERE

    public void setDto(T dto) { // HERE
        this.dto = dto;
    }

    public T getDto() { // HERE
        return dto;
    }
}
