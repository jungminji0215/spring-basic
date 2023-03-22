package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.order.Order;
import hello.core.service.member.MemberService;
import hello.core.service.member.impl.MemberServiceImpl;
import hello.core.service.order.OrderService;
import hello.core.service.order.impl.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "강보경", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"가방", 10000);

        System.out.println("주문 : " + order);
        System.out.println("할인 가격 : " + order.calculatePrice());
    }
}
