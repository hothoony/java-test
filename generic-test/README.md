### DtoManager
```java
public class DtoManager<T> {
    
    private T dto;

    public void setDto(T dto) {
        this.dto = dto;
    }

    public T getDto() {
        return dto;
    }
}
```

### DtoManagerTest
```java
class DtoManagerTest {

    @Test
    void memberDto_test() {
        DtoManager<MemberDto> dtoManager = new DtoManager<>();
        dtoManager.setDto(new MemberDto());
        MemberDto dto = dtoManager.getDto();
        System.out.println("dto = " + dto);
    }

    @Test
    void teamDto_test() {
        DtoManager<TeamDto> dtoManager = new DtoManager<>();
        dtoManager.setDto(new TeamDto());
        TeamDto dto = dtoManager.getDto();
        System.out.println("dto = " + dto);
    }
}
```