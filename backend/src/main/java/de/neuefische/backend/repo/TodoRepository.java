package de.neuefische.backend.repo;

import de.neuefische.backend.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {

    List<Todo> todos = new ArrayList<>();

    


    static int id = 0;
    public List<Todo> getAllTodos(){
       return todos;
    }

    public Todo getTodoById(int id) {

        Todo result = null;
        for(int i = 0; i< todos.size();i++ ){
            if(todos.get(i).getId() == id){
                result = todos.get(i);
            }
        }
        return result;
    }


    public void postTodo( Todo todo ){
        todo.setId(id);
        todos.add(todo);
        id++;
    }

    public void deleteTodo(int id){
        for(int i = 0; i < todos.size(); i++){
            if(todos.get(i).getId() == id){
                todos.remove(i);
            }
        }

    }

    public void putTodo(int id, Todo todo){
        for(int i = 0; i < todos.size();i++){
            if(todos.get(i).getId()==id){
                todos.set(i,todo);
            }
        }


    }


}
