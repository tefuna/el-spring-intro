package jp.tfn.udemy.springintro.service.impl;

import java.time.OffsetDateTime;
import java.util.List;

import jp.tfn.udemy.springintro.entity.Inquiry;
import jp.tfn.udemy.springintro.repository.InquiryRepository;
import jp.tfn.udemy.springintro.service.InquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InquiryServiceImpl implements InquiryService {

    private final InquiryRepository repository;

    @Override
    public void save(Inquiry inquiry) {
        inquiry.setCreated(OffsetDateTime.now());
        repository.insert(inquiry);
    }

    @Override
    public List<Inquiry> findAll() {
        return repository.findAll();
    }

}
