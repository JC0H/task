package com.jcoh.task.repository;

import com.jcoh.task.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
