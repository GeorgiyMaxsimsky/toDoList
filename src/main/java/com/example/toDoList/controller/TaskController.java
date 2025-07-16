package com.example.toDoList.controller;


import com.example.toDoList.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/task")
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    @GetMapping
    public List <Task> getAllTasks(){
        return tasks;
    }
    @PostMapping
    public Task createTask(@RequestBody Task task){
        task.setId((long)(tasks.size()+1));
        tasks.add(task);
        return task;



    }



}
