package de.neuefische.backend.service;


import de.neuefische.backend.model.Todo;
import de.neuefische.backend.repo.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository repo;

    public List<Todo> getAllTodos(){
        return repo.getAllTodos();
    }

    public Todo getTodoById(int id ){
        return repo.getTodoById(id);
    }

    public void postTodo(Todo todo){
      repo.postTodo(todo);
    }


    public void deleteTodo(int id){
        repo.deleteTodo(id);
    }

    public void putTodo(int id, Todo todo){
        repo.putTodo(id, todo);
    }

}
