package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.service.member.MemberService;
import hello.core.service.member.impl.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "강보경", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("회원 가입 : " + member.getName());
        System.out.println("회원 조회 : " + findMember.getName());
    }
    
}
