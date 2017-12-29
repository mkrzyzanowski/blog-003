package com.automatingguy.pageobjects;

import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject(css = "header")
public class NewTodoInput {

  @FindBy(css = "h1")
  private WebElement header;

  @FindBy(css = "input#new-todo")
  private WebElement input;

  public String getHeaderText() {
    return header.getText();
  }

  public NewTodoInput addTodo(String text) {
    input.sendKeys(text);
    input.sendKeys(Keys.ENTER);
    return this;
  }
}
