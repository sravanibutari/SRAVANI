package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ToDoDAO;
import com.example.demo.model.ToDo;
@Service
public class ToDoServiceImpl implements ToDoService {
	
	private ToDoDAO toDoDAo;
	
@Autowired
	public ToDoServiceImpl(ToDoDAO toDoDAo) {
		super();
		this.toDoDAo = toDoDAo;
	}


	@Override
	public List<ToDo> getAllToDos() {
		
		return toDoDAo.getAllToDos();
	}

}
