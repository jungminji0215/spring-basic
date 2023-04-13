package hello.core.service.member.impl;

import hello.core.member.Member;
import hello.core.repository.MemberRepository;
import hello.core.repository.impl.MemoryMemberRepository;
import hello.core.service.member.MemberService;

public class MemberServiceImpl implements MemberService {
    // 추상화에만 의존하고 있는 상황
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
