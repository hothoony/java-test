## Generic class

- 인스턴스 생성할 때 타입을 전달

```java
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
```

```java
class GenericClazzTest {

    @Test
    void getDto_teamDto() {
        GenericClazz<TeamDto> genericClazz = new GenericClazz<>(); // HERE
        genericClazz.setDto(new TeamDto());

        TeamDto dto = genericClazz.getDto();

        assertThat(dto.getClass() == TeamDto.class);
        System.out.println("dto.getClass() = " + dto.getClass());
        System.out.println("dto = " + dto);
    }

    @Test
    void getDto_memberDto() {
        GenericClazz<MemberDto> genericClazz = new GenericClazz<>(); // HERE
        genericClazz.setDto(new MemberDto());

        MemberDto dto = genericClazz.getDto();

        assertThat(dto.getClass() == MemberDto.class);
        System.out.println("dto.getClass() = " + dto.getClass());
        System.out.println("dto = " + dto);
    }

    @Test
    void getDtoList_teamDto() {
        GenericClazz<TeamDto> genericClazz = new GenericClazz<>();
        genericClazz.setDtoList(new TeamDto());

        List<TeamDto> list = genericClazz.getDtoList();
        System.out.println("list = " + list);
    }

    @Test
    void getDtoList_memberDto() {
        GenericClazz<MemberDto> genericClazz = new GenericClazz<>();
        genericClazz.setDtoList(new MemberDto());

        List<MemberDto> list = genericClazz.getDtoList();
        System.out.println("list = " + list);
    }
}
```
<br>

## Generic method

- 메소드 호출할 때 타입을 전달

```java
public class GenericMethod {

    public <T> T getDto(String str, Class<T> clazz) { // HERE
        Object object = null;
        if (clazz.isAssignableFrom(TeamDto.class)) { // HERE
            object = new TeamDto(str);
        }
        else if (clazz.isAssignableFrom(MemberDto.class)) { // HERE
            object = new MemberDto(str);
        }
        else {
            object = new Object();
        }
        return clazz.cast(object); // HERE
    }

    public <T> List<T> getDtoList(String str, Class<T> clazz) {
        List objects = new ArrayList<>();
        if (clazz.isAssignableFrom(TeamDto.class)) { // HERE
            objects.add(new TeamDto(str));
        }
        else if (clazz.isAssignableFrom(MemberDto.class)) {
            objects.add(new MemberDto(str));
        }
        else {
            objects.add(new Object());
        }
        return objects;
    }
}
```

```java
public class GenericMethodTest {

    @Test
    void getDto_teamDto() {
        GenericMethod genericMethod = new GenericMethod();

        TeamDto teamDto = genericMethod.getDto("abc", TeamDto.class); // HERE

        System.out.println("teamDto = " + teamDto);
        assertThat(teamDto.getClass()).isEqualTo(TeamDto.class);
    }

    @Test
    void getDto_memberDto() {
        GenericMethod genericMethod = new GenericMethod();

        MemberDto memberDto = genericMethod.getDto("abc", MemberDto.class); // HERE

        System.out.println("memberDto = " + memberDto);
        assertThat(memberDto.getClass()).isEqualTo(MemberDto.class);
    }

    @Test
    void getDtoList_teamDto() {
        GenericMethod genericMethod = new GenericMethod();
        List<TeamDto> list = genericMethod.getDtoList("abc", TeamDto.class);
        System.out.println("list = " + list);
    }

    @Test
    void getDtoList_memberDto() {
        GenericMethod genericMethod = new GenericMethod();
        List<MemberDto> list = genericMethod.getDtoList("abc", MemberDto.class);
        System.out.println("list = " + list);
    }
}
```

<br>

https://docs.oracle.com/javase/tutorial/java/generics/types.html

Type Parameter Naming Conventions
- E - Element (used extensively by the Java Collections Framework)
- K - Key
- N - Number
- T - Type
- V - Value
- S,U<V etc. - 2nd, 3rd, 4th types

The Diamond

Multiple Type Parameters
```java
public interface Pair<K, V> {
    public K getKey();
    public V getValue();
}
```

Parameterized Types

Generic Method

Bounded Type Parameter

Wildcards
```java
List<? extends Integer>
List<? extends Number>
List<? super Integer>
```
