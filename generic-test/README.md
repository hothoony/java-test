## Generic class

- 인스턴스 생성할 때 타입을 전달

```java
class DtoManagerTest {

    @Test
    void teamDto() {
        DtoManager<TeamDto> genericClazz = new DtoManager<>(); // HERE
        genericClazz.setDto(new TeamDto());

        TeamDto dto = genericClazz.getDto();

        assertThat(dto.getClass() == TeamDto.class);
        System.out.println("dto.getClass() = " + dto.getClass());
        System.out.println("dto = " + dto);
    }

    @Test
    void memberDto() {
        DtoManager<MemberDto> genericClazz = new DtoManager<>(); // HERE
        genericClazz.setDto(new MemberDto());

        MemberDto dto = genericClazz.getDto();

        assertThat(dto.getClass() == MemberDto.class);
        System.out.println("dto.getClass() = " + dto.getClass());
        System.out.println("dto = " + dto);
    }
}
```

```java
public class DtoManager<T> { // HERE

    private T dto; // HERE

    public void setDto(T dto) { // HERE
        this.dto = dto;
    }

    public T getDto() { // HERE
        return dto;
    }
}
```
<br>

## Generic method

- 메소드 호출할 때 타입을 전달

```java
public class GenericMethodTest {

    @Test
    void teamDto() {
        GenericMethod genericMethod = new GenericMethod();

        TeamDto teamDto = genericMethod.getValue("abc", TeamDto.class); // HERE

        System.out.println("teamDto = " + teamDto);
        assertThat(teamDto.getClass()).isEqualTo(TeamDto.class);
    }

    @Test
    void memberDto() {
        GenericMethod genericMethod = new GenericMethod();

        MemberDto memberDto = genericMethod.getValue("abc", MemberDto.class); // HERE

        System.out.println("memberDto = " + memberDto);
        assertThat(memberDto.getClass()).isEqualTo(MemberDto.class);
    }
}
```

```java
public class GenericMethod {

    public <T> T getValue(String str, Class<T> clazz) { // HERE
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
