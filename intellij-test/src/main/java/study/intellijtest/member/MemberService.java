package study.intellijtest.member;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MemberService {

    private MemberDto3 memberDto2;
    
    public List<MemberDto3> getMembers() {
        MemberDto3 memberDto1 = new MemberDto3();
        MemberDto3 memberDto2 = new MemberDto3();
        return Arrays.asList(memberDto1, memberDto2);
    }
}
