package study.securitytest.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import study.securitytest.global.security.UserDetailsServiceImpl;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final UserDetailsServiceImpl userDetailsService;

    @GetMapping("/accessDenied")
    public String accessDenied() {
        return "accessDenied";
    }

    @GetMapping("/myinfo")
    public String myinfo() {
        return "myinfo";
    }

    @GetMapping("/login")
    public String loginGet() {
        return "login";
    }

//    @PostMapping("/login-proc")
//    public String loginProc(@Valid MemberDto memberDto) {
//        System.out.println("------------------------");
//        System.out.println("## MemberController.loginProc");
//        System.out.println("memberDto = " + memberDto);
//        UserDetails userDetails = userDetailsService.loadUserByUsername(memberDto.getName());
//        System.out.println("userDetails = " + userDetails);
//        return "redirect:/";
//    }
//
//    @GetMapping("/logout")
//    public String logoutGet(HttpServletRequest request, HttpServletResponse response) {
//        System.out.println("---------- logoutGet");
//        logout(request, response);
//        return "logout";
//    }
//
//    @PostMapping("/logout")
//    public String logout(HttpServletRequest request, HttpServletResponse response) {
//        System.out.println("---------- logoutPost");
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth != null) {
//            new SecurityContextLogoutHandler().logout(request, response, auth);
//        }
//        return "redirect:/login?logout";
//    }

    @GetMapping("/signup")
    public String signupGet() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@Valid MemberDto memberDto) {
        System.out.println("memberDto = " + memberDto);
        memberService.joinMember(memberDto);
        return "redirect:/";
    }

}
