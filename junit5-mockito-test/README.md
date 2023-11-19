
## `@Mock` vs `@MockBean`
`@Mock`
- applicationContext 가 필요없을 때 사용한다
- `@InjectMocks` 오브젝트에 `@Mock` 으로 선언된 오브젝트를 주입한다
- `@ExtendWith(MockitoExtension.class)` 가 필요하다
```java
@ExtendWith(MockitoExtension.class)
public class ArrayListTest_mock {

    @Mock
    ArrayList list;

    @InjectMocks
    MemberService memberService;

    @Test
    void test2() {

        list.add(11);
        list.add(22);
        list.add(33);
        int size = list.size();

        assertThat(size).isEqualTo(0);
    }
}
```

`@MockBean`
- applicationContext 가 필요할 때 사용한다
- @MockBean 으로 선언된 오브젝트를 applicationContext 에 등록한다
```java
@SpringBootTest(classes = {
        MemberService.class,
        MemberAgreeService.class,
        ModelMapper.class
})
public class MemberServiceTest_saveMember_mock2 {

    @Autowired
    MemberService memberService;

    @MockBean
    MemberRepository memberRepository;
}
```

## @Mock vs @Spy

@Mock
- 더미 오브젝트를 사용한다

@Spy
- 실제 오브젝트를 사용한다
- 일부 메소드만 mocking 할 수 있다

## @MockBean vs @SpyBean
- @Mock, @Spy 와 기본 동작은 같다
- applicationContext 가 필요한 경우에 @MockBean, @SpyBean 으로 선언해서 사용한다

## void 메소드 mocking

MailService test
```java
@ExtendWith(MockitoExtension.class)
class MailServiceTest {

    @Spy
    MailService mailService;

    @Test
    void test1() {

        // mailService.sendMessage(), void 메소드를 mocking
        willAnswer(invocation -> {
            System.out.println("SEND MAIL MESSAGE");
            return null;
        }).given(mailService).sendMessage(anyString());

        mailService.sendMail("123");
    }

    @Test
    void test2() {

        mailService.sendMail("123");
    }
}
```

MailService
```java
@Service
public class MailService {

    public void sendMail(String str) {
        System.out.println("sendMail begin");
        sendMessage(str);
        System.out.println("sendMail end");
    }

    public void sendMessage(String str) {
        System.out.println("sendMessage - " + str);
    }
}
```

## private method mocking
