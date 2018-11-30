package com.jcoh.task.controller;

import com.jcoh.task.domain.Task;
import com.jcoh.task.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/task")
public class TestController {

    private TaskService taskService;

    public TestController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})
    public Iterable<Task> list(){
        return taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return this.taskService.save(task);
    }
}
