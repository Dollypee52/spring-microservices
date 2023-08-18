package com.interswitchng.taskservice;

import com.interswitchng.taskservice.model.Task;
import com.interswitchng.taskservice.repository.TaskRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(info = @Info(title= "Task API", version = "1.0",description = "Documentation Task API v1.0"))
public class TaskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskServiceApplication.class, args);
	}


	@Bean
	TaskRepository taskRepository() {
		TaskRepository taskRepository =  new TaskRepository();
		taskRepository.add(new Task(8L, "Building a house",1L ));
		taskRepository.add(new Task(9L, "Baking a cake",2L ));
		taskRepository.add(new Task(10L, "Contact Center",1L ));
		taskRepository.add(new Task(11L, "Developing an app",2L ));
		return taskRepository;
	}
}
