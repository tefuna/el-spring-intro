package jp.tfn.udemy.springintro.controller;

import java.util.List;

import jp.tfn.udemy.springintro.controller.converter.InquiryFormConverter;
import jp.tfn.udemy.springintro.entity.Inquiry;
import jp.tfn.udemy.springintro.service.InquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/inquiry")
@RequiredArgsConstructor
public class InquiryController {

    private final InquiryService service;

    @GetMapping("/")
    public String index(InquiryForm inquiryForm,
            Model model,
            @ModelAttribute("complete") String complete) {
        model.addAttribute("title", "inquiry form");
        return "inquiry/form";
    }

    @PostMapping("/")
    public String formGoBack(InquiryForm inquiryForm, Model model) {
        model.addAttribute("title", "inquiry form");
        return "inquiry/form";
    }

    @GetMapping("/list")
    public String list(InquiryForm inquiryForm, Model model) {
        List<Inquiry> inquiries = service.findAll();
        model.addAttribute("inquiries", inquiries);
        model.addAttribute("title", "inquiry form");

        return "inquiry/index_boot";
    }

    @PostMapping("/confirm")
    public String confirm(@Validated InquiryForm form, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("title", "Inquiry Form");
            return "inquiry/form";
        }

        model.addAttribute("title", "Confirm Page");
        return "inquiry/confirm";
    }

    @PostMapping("/complete")
    public String complete(@Validated InquiryForm form,
            BindingResult result,
            Model model,
            RedirectAttributes redirect) {
        if (result.hasErrors()) {
            model.addAttribute("title", "Inquiry form");
            return "inquiry/form";
        }


        final Inquiry inquiry = InquiryFormConverter.convert(form);
        service.save(inquiry);

        System.out.println("aaa");

        redirect.addFlashAttribute("complete", "Registered");
        return "redirect:/inquiry/";
    }

}
