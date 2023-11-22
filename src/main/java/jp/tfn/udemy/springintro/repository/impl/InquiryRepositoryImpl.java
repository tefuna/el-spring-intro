package jp.tfn.udemy.springintro.repository.impl;

import java.util.List;

import jp.tfn.udemy.springintro.entity.Inquiry;
import jp.tfn.udemy.springintro.repository.InquiryRepository;
import jp.tfn.udemy.springintro.repository.mapper.InquiryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class InquiryRepositoryImpl implements InquiryRepository {

    private final InquiryMapper mapper;

    @Override
    public void insert(Inquiry inquiry) {
        mapper.insert(inquiry);
    }

    @Override
    public List<Inquiry> findAll() {
        List<Inquiry> results = mapper.selectAll();
        return results;
    }
}
