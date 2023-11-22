package jp.tfn.udemy.springintro.repository.impl;

import java.util.List;

import jp.tfn.udemy.springintro.entity.Todo;
import jp.tfn.udemy.springintro.repository.TodoRepository;
import jp.tfn.udemy.springintro.repository.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TodoRepositoryImpl implements TodoRepository {

    private final TodoMapper mapper;

    @Override
    public List<Todo> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public void insert(Todo todo) {
        mapper.insert(todo);
    }

    @Override
    public int update(Todo todo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public int deleteById(int todoId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

}
