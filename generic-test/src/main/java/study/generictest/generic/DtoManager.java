package study.generictest.generic;

public class DtoManager<T> {
    
    private T dto;

    public void setDto(T dto) {
        this.dto = dto;
    }

    public T getDto() {
        return dto;
    }
}
