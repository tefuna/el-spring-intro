package jp.tfn.udemy.springintro.repository;

import java.util.List;

import jp.tfn.udemy.springintro.entity.Todo;

public interface TodoRepository {

    List<Todo> selectAll();

    void insert(Todo todo);

    int update(Todo todo);

    int deleteById(int todoId);

}
