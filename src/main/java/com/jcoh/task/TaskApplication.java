package com.jcoh.task;

import com.jcoh.task.domain.SizeType;
import com.jcoh.task.domain.Task;
import com.jcoh.task.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService){
		return args -> {
			taskService.save( new Task(1L,"Andrii", "Red", SizeType.S) );
			taskService.save( new Task(2L,"Szymon", "Blue", SizeType.M) );
			taskService.save( new Task(3L,"Jack", "Brown", SizeType.L) );
			taskService.save( new Task(4L,"Tetiana", "Orange", SizeType.XL) );
			taskService.save( new Task(5L,"Radek", "Black", SizeType.S) );
		};
	}
}
