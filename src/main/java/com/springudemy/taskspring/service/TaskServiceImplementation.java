package com.springudemy.taskspring.service;

import com.springudemy.taskspring.domain.Task;
import com.springudemy.taskspring.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImplementation implements TaskService{
    private TaskRepository taskRepository;

    public TaskServiceImplementation(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }
}
