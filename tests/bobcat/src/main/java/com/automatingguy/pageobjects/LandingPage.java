package com.automatingguy.pageobjects;

import com.cognifide.qa.bb.qualifier.FindPageObject;
import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.WebDriver;

import javax.inject.Inject;
import javax.inject.Named;

@PageObject
public class LandingPage {

  @Inject
  private WebDriver webDriver;

  @Inject
  @Named("url")
  private String url;

  @FindPageObject
  private TodoApp todoApp;

  public TodoApp getTodoApp() {
    return todoApp;
  }

  public LandingPage open() {
    webDriver.get(url);
    return this;
  }
}
