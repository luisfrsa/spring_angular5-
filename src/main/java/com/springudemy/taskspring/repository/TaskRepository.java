package com.springudemy.taskspring.repository;

import com.springudemy.taskspring.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Long>{

}
