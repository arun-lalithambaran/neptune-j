package com.neptune.afo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private List<Todo> todoList = new ArrayList<>(Arrays.asList(
            new Todo("test 111", "This is a test desc 1", 1L),
            new Todo("test 222", "This is a test desc 2", 2L)
    ));

    public List<Todo> getTodoList() {
        return todoList;
    }

    public Todo getTodo(Long id) {
        return todoList.stream().filter(el -> el.getId().equals((id))).findFirst().orElse(null);
    }

    public void addTodo(Todo todo) {
        this.todoList.add(todo);
    }

    public void updateTodo(Long id, Todo todo) {
        for(int i = 0; i < todoList.size(); i++) {
            Todo t = todoList.get(i);
            if(t.getId().equals(id)) {
                todoList.set(i, todo);
                return;
            }
        }
    }

    public void deleteTodo(Long id) {
        this.todoList.removeIf(el -> el.getId().equals(id));
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }
}
