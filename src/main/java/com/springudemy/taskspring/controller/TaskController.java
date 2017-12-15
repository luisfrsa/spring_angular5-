package com.springudemy.taskspring.controller;

import com.springudemy.taskspring.domain.Task;
import com.springudemy.taskspring.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService=taskService;
    }

    @GetMapping(value={"","/"})
    public Iterable<Task> list(){
        return this.taskService.list();
    }


    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return this.taskService.save(task);
    }
}
