package jp.tfn.udemy.springintro.repository.impl;

import jp.tfn.udemy.springintro.entity.Member;
import jp.tfn.udemy.springintro.repository.MemberRespository;
import jp.tfn.udemy.springintro.repository.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRespositoryImpl implements MemberRespository {

    private final MemberMapper mapper;

    public Member findMemberById(int id) {
        Member member = mapper.findById(id);
        return member;
    }

}
