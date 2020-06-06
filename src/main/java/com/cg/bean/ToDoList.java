package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDoList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int taskId;

	private String taskName;
	private String type;
	private String dueDate;

	public int getId() {
		return this.taskId;
	}

	public void setId(int id) {
		this.taskId = id;
	}

	public String getName() {
		return taskName;
	}

	public void setName(String name) {
		taskName = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

}
