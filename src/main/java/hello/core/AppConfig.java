package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.repository.impl.MemoryMemberRepository;
import hello.core.service.member.MemberService;
import hello.core.service.member.impl.MemberServiceImpl;
import hello.core.service.order.OrderService;
import hello.core.service.order.impl.OrderServiceImpl;

// AppConfig가 애플리케이션의 실제 동작에 필요한 구현 객체를 생성하고있다.
public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
