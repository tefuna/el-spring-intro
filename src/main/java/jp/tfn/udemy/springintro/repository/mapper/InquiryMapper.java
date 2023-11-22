package jp.tfn.udemy.springintro.repository.mapper;

import java.util.List;

import jp.tfn.udemy.springintro.entity.Inquiry;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InquiryMapper {

    void insert(Inquiry inquiry);

    List<Inquiry> selectAll();

}
