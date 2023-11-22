package jp.tfn.udemy.springintro.service.impl;

import java.util.List;

import jp.tfn.udemy.springintro.entity.Todo;
import jp.tfn.udemy.springintro.repository.TodoRepository;
import jp.tfn.udemy.springintro.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository repository;

    @Override
    public List<Todo> findAll() {
        return repository.selectAll();
    }

    @Override
    public void save(Todo todo) {
        repository.insert(todo);
    }

}
