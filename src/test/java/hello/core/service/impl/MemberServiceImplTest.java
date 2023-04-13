//package hello.core.service.impl;
//
//import hello.core.member.Grade;
//import hello.core.member.Member;
//import hello.core.service.member.MemberService;
//import hello.core.service.member.impl.MemberServiceImpl;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//class MemberServiceImplTest {
//    MemberService memberService = new MemberServiceImpl();
//
//    @Test
//    void join() {
//        // given
//        Member member = new Member(1L, "민지", Grade.VIP);
//
//        // when
//        memberService.join(member);
//        Member findMember = memberService.findMember(1L);
//
//        // then
//        Assertions.assertEquals(member, findMember);
//    }
//
//    @Test
//    void findMember() {
//    }
//}