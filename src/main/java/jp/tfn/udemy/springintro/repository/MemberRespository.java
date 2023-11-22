package jp.tfn.udemy.springintro.repository;

import jp.tfn.udemy.springintro.entity.Member;

public interface MemberRespository {

    Member findMemberById(int id);

}
