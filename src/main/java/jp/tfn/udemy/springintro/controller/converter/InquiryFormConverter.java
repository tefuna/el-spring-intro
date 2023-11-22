package jp.tfn.udemy.springintro.controller.converter;

import jp.tfn.udemy.springintro.controller.InquiryForm;
import jp.tfn.udemy.springintro.entity.Inquiry;

public final class InquiryFormConverter {

    public static Inquiry convert(InquiryForm form) {
        Inquiry entity = new Inquiry();
        entity.setName(form.getName());
        entity.setEmail(form.getEmail());
        entity.setContents(form.getContents());

        return entity;
    }
}
