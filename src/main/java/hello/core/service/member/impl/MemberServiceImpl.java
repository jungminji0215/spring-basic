package hello.core.service.member.impl;

import hello.core.member.Member;
import hello.core.repository.MemberRepository;
import hello.core.repository.impl.MemoryMemberRepository;
import hello.core.service.member.MemberService;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
