package com.example.demo.View;

import com.example.demo.Model.TodoModel;
import com.example.demo.Model.TodoRepo;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class MyToDo extends VerticalLayout {

	private TodoRepo todoRepo;

	public MyToDo(TodoRepo todoRepo) {

		this.todoRepo = todoRepo;

		TextField taskTextField = new TextField("Task", "I need to cook!");
		
		
		Button saveButton = new Button("Save!");
		saveButton.addClickShortcut(Key.ENTER);
		
		HorizontalLayout inputDataForHorizontalLayout = new HorizontalLayout(taskTextField, saveButton);

		VerticalLayout todos = new VerticalLayout();

		saveButton.addClickListener(click -> {
//			System.err.println("you clicked"+taskTextField.getValue());
			TodoModel todo = todoRepo.save(new TodoModel(taskTextField.getValue()));
			todos.add(createCheckBox(todo));
			taskTextField.clear();//clear empty input
		});

		todoRepo.findAll().forEach(todo -> {
			System.err.println(todo.getTask());
		 todos.add(createCheckBox(todo));
			
		});

		add(new H1("Welcome at ToDo's"), inputDataForHorizontalLayout, todos);

	}

	private Component createCheckBox(TodoModel todo) {

		Checkbox checkbox = new Checkbox(todo.getTask(), todo.isDone(), Myevent -> {
			todo.setDone(Myevent.getValue());
			todoRepo.save(todo);
		});

		return checkbox;
	}

}
