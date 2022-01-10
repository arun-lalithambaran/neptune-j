package com.neptune.afo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return todoService.getTodoList();
    }

    @GetMapping("/todos/{id}")
    public Todo getTodo(@PathVariable Long id) {
        return todoService.getTodo(id);
    }
    @PostMapping("/todos")
    public void addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
    }
    @PutMapping("/todos/{id}")
    public void updateTodo(@RequestBody Todo todo, @PathVariable Long id) {
        todoService.updateTodo(id, todo);
    }
    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
}
