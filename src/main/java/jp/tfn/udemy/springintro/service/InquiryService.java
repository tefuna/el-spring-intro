package jp.tfn.udemy.springintro.service;

import java.util.List;

import jp.tfn.udemy.springintro.entity.Inquiry;

public interface InquiryService {

    void save(Inquiry inquiry);

    List<Inquiry> findAll();

}
