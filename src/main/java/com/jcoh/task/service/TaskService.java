package com.jcoh.task.service;

import com.jcoh.task.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {
    Iterable<Task> list();

    Task save(Task task);
}
