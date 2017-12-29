package com.automatingguy.pageobjects;

import com.cognifide.qa.bb.constants.Timeouts;
import com.cognifide.qa.bb.provider.selenium.BobcatWait;
import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.inject.Inject;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

@PageObject(css = "li")
public class Todo {

  @Inject
  private Actions actions;

  @Inject
  private BobcatWait wait;

  @FindBy(css = "input.toggle")
  private WebElement checkbox;

  @FindBy(css = "label")
  private WebElement label;

  @FindBy(css = "button.destroy")
  private WebElement deleteButton;

  public Todo toggle() {
    checkbox.click();
    return this;
  }

  public String getLabel() {
    return label.getText();
  }

  public void delete() {
    actions.moveToElement(label).perform();
    wait.withTimeout(Timeouts.SMALL).until(visibilityOf(deleteButton)).click();
  }
}
