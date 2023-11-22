package jp.tfn.udemy.springintro.repository.mapper;

import jp.tfn.udemy.springintro.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {

    Member findById(@Param("id") int id);

}
