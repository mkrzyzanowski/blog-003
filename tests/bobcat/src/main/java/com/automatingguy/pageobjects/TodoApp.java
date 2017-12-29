package com.automatingguy.pageobjects;

import com.cognifide.qa.bb.qualifier.FindPageObject;
import com.cognifide.qa.bb.qualifier.PageObject;

@PageObject(css = "#todoapp")
public class TodoApp {

  @FindPageObject
  private NewTodoInput newTodoInput;

  @FindPageObject
  private TodoList todoList;

  public NewTodoInput getNewTodoInput() {
    return newTodoInput;
  }

  public TodoList getTodoList() {
    return todoList;
  }
}
