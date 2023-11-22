package jp.tfn.udemy.springintro.service;

import java.util.List;

import jp.tfn.udemy.springintro.entity.Todo;

public interface TodoService {

    List<Todo> findAll();

    void save(Todo todo);

}
