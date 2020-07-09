package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Task;
import com.cg.service.ToDoListService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@CrossOrigin
@Api(value = "ToDo CRUD application")
public class ToDoListController {

	@Autowired
	ToDoListService service;

	@GetMapping("getTasks")
	@ApiOperation(value = "View tasks")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Task.class),
			@ApiResponse(code = 500, message = "Failure", response = Task.class) })
	public List<Task> getTasks() {
		return service.findAll();
	}

	@PostMapping("addTask")
	@ApiOperation(value = "Add task")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Success", response = Task.class),
			@ApiResponse(code = 500, message = "Failure", response = Task.class) })
	public Task addTask(@RequestBody Task task) {
		return service.save(task);
	}

	@PutMapping("updateTask")
	@ApiOperation(value = "Update task")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Task.class),
			@ApiResponse(code = 500, message = "Failure", response = Task.class) })
	public Task updateTask(@RequestBody Task task) {
		return service.save(task);
	}

	@DeleteMapping("deleteTask/{taskId}")
	@ApiOperation(value = "Delete task")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Task.class),
			@ApiResponse(code = 500, message = "Failure", response = Task.class) })
	public void deleteTask(@PathVariable int taskId) {
		service.deleteById(taskId);
	}

}
