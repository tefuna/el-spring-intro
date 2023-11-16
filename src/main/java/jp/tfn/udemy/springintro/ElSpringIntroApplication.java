package jp.tfn.udemy.springintro;

import java.util.List;

import jp.tfn.udemy.springintro.entity.Member;
import jp.tfn.udemy.springintro.service.MemberService;
import jp.tfn.udemy.springintro.service.impl.MemberServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElSpringIntroApplication {

    public static void main(String[] args) {

        Main main = new Main();
        main.greet(2);
        main.showMembers();
        main.sumOf(5, 7);
        main.sumOf(7, 7);

        SpringApplication.run(ElSpringIntroApplication.class, args);
    }

}

class Main {

    // private final MemberService service;

    // @Autowired
    // public Main(MemberService memberService) {
    // this.service = memberService;
    // }

    private MemberService service = MemberServiceImpl.getInstance();

    public void greet(int i) {
        System.out.println(service.greet(i));
    }

    public void showMembers() {
        List<Member> members = service.getAllMembers();
        System.out.println(members);
    }

    public void sumOf(int x, int y) {
        System.out.println(service.sumOf(x, y));
    }

}