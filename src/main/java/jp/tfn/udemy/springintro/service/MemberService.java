package jp.tfn.udemy.springintro.service;

import java.util.List;

import jp.tfn.udemy.springintro.entity.Member;

/**
 * MemberService
 */
public interface MemberService {

    String greet(int type);

    List<Member> getAllMembers();

    int sumOf(int x, int y);

}
