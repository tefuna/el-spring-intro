package jp.tfn.udemy.springintro.controller;

import jp.tfn.udemy.springintro.entity.Member;
import jp.tfn.udemy.springintro.repository.MemberRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/sample")
public class SampleController {

    private final MemberRespository memberRepository;

    public SampleController(MemberRespository memberRespository) {
        this.memberRepository = memberRespository;
    }

    @GetMapping("/test")
    public String index(Model model) {
        log.info("sample#index is called");

        Member member = memberRepository.findMemberById(1);
        log.info("member = {}", member);
        model.addAttribute("title", "inquiry Form");
        model.addAttribute("member", member);
        return "test";
    }
}
