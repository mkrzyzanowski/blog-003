package com.automatingguy.pageobjects;

import com.cognifide.qa.bb.qualifier.FindPageObject;
import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@PageObject(css = "#main")
public class TodoList {

  @FindBy(css = "input[name='toggle-all']")
  private WebElement toggleAll;

  @FindPageObject
  private List<Todo> todos;

  public TodoList toggleAllTodos() {
    toggleAll.click();
    return this;
  }

  public List<Todo> getTodos() {
    return todos;
  }
}
