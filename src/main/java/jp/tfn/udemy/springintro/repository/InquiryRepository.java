package jp.tfn.udemy.springintro.repository;

import java.util.List;

import jp.tfn.udemy.springintro.entity.Inquiry;

public interface InquiryRepository {

    void insert(Inquiry inquiry);

    List<Inquiry> findAll();

}
