package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bean.Task;

public interface ToDoListRepository extends JpaRepository<Task, Integer>{

}
