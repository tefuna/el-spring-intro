package jp.tfn.udemy.springintro.repository.mapper;

import java.util.List;

import jp.tfn.udemy.springintro.entity.Todo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoMapper {

    List<Todo> selectAll();

    void insert(Todo todo);

    int update(Todo todo);

    int deleteById(int todoId);
}
