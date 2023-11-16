package jp.tfn.udemy.springintro.service.impl;

import java.util.ArrayList;
import java.util.List;

import jp.tfn.udemy.springintro.entity.Member;
import jp.tfn.udemy.springintro.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private static final String[] GREETINGS = { "Morning", "Hello", "Evening" };

    private static final MemberService SERVICE = new MemberServiceImpl();

    // private
    private MemberServiceImpl() {
    };

    public static MemberService getInstance() {
        return SERVICE;
    }

    @Override
    public String greet(int type) {
        return GREETINGS[type];
    }

    @Override
    public List<Member> getAllMembers() {
        List<Member> members = new ArrayList<>();
        members.add(new Member(1, "Linda", "linda@example.com"));
        members.add(new Member(2, "James", "james@example.com"));

        return members;
    }

    @Override
    public int sumOf(int x, int y) {
        if (y < x) {
            throw new IllegalArgumentException("y should be larger than x");
        }
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }

        return sum;
    }

}
