package study.securitytest.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public Long joinMember(MemberDto memberDto) {
        memberDto.setPassword(passwordEncoder.encode(memberDto.getPassword()));

        Member member = new Member();
        member.setName(memberDto.getName());
        member.setPassword(memberDto.getPassword());
        member.setRoles(getRole(memberDto));

        Member saveMember = memberRepository.save(member);
        return saveMember.getId();
    }

    private String getRole(MemberDto memberDto) {
        if (memberDto.getRoles() != null) {
            return memberDto.getRoles();
        }
        if ("admin".equals(memberDto.getName())) return RoleType.ADMIN.toString();
        if ("staff".equals(memberDto.getName())) return RoleType.STAFF.toString();
        if ("teacher".equals(memberDto.getName())) return RoleType.TEACHER.toString();
        return RoleType.USER.toString();
    }

}
