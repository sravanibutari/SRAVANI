package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
private String todoid;
private String todoName;

public String getTodoid() {
	return todoid;
}

public void setTodoid(String todoid) {
	this.todoid = todoid;
}

public String getTodoName() {
	return todoName;
}

public void setTodoName(String todoName) {
	this.todoName = todoName;
}

}
