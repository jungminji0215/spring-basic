package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.repository.MemberRepository;
import hello.core.repository.impl.MemoryMemberRepository;
import hello.core.service.member.MemberService;
import hello.core.service.member.impl.MemberServiceImpl;
import hello.core.service.order.OrderService;
import hello.core.service.order.impl.OrderServiceImpl;

// AppConfig 가 애플리케이션의 실제 동작에 필요한 구현 객체를 생성하고있다.
// 역할과 구현 클래스가 한눈에 들어온다.
// 애플리케이션 전체 구성이 어떻게 되어있는지 빠르게 파악할 수 있다.
public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
