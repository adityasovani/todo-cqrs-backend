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

@RestController
@CrossOrigin
public class ToDoListController {

	@Autowired
	ToDoListService service;

	@GetMapping("getTasks")
	public List<Task> getTasks() {
		return service.findAll();
	}

	@PostMapping("addTask")
	public Task addTask(@RequestBody Task task) {
		return service.save(task);
	}

	@PutMapping("updateTask")
	public Task updateTask(@RequestBody Task task) {
		return service.save(task);
	}

	@DeleteMapping("deleteTask/{taskId}")
	public void deleteTask(@PathVariable int taskId) {
		service.deleteById(taskId);
	}

}
