package de.neuefische.backend.controller;




import de.neuefische.backend.model.Todo;
import de.neuefische.backend.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/todo")
public class TodoController {

    private final TodoService service;

    @GetMapping()
    public List<Todo> getAllTodos(){
        return service.getAllTodos();
    }


    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable int id){
        return  service.getTodoById(id);
    }

    @PostMapping()
    public void postTodo( @RequestBody Todo todo){
        service.postTodo(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable int id){
        service.deleteTodo(id);
    }

    @PutMapping("/{id}")
    public void putTodo(@PathVariable int id, @RequestBody Todo todo){
        service.putTodo(id, todo);
}


}
