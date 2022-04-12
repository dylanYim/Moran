package dylan.moran.service;

import dylan.moran.domain.member.Member;

public interface MemberService {

    public Member getMember(Long id);
    public int addMember(Long id);
    public int deleteMember(Long id);
    public Member updateMember(Long id);
}
