package com.springudemy.taskspring.service;

import com.springudemy.taskspring.domain.Task;

public interface TaskService {
    Iterable<Task> list();
    Task save(Task task);
}
