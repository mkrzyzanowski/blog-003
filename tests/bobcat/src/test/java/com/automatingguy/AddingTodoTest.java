package com.automatingguy;

import com.automatingguy.pageobjects.LandingPage;
import com.automatingguy.pageobjects.Todo;
import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.TestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class AddingTodoTest {

  @Inject
  private LandingPage landingPage;

  @Before
  public void setUp() {
    landingPage.open();
  }

  @Test
  public void userCanAddNewTodo() {
    List<String> expectedTodos =
        Collections.singletonList("Yet another very important task on the list");

    landingPage.getTodoApp()
        .getNewTodoInput()
        .addTodo(expectedTodos.get(0));

    List<String> actualTodos = landingPage.getTodoApp()
        .getTodoList()
        .getTodos().stream()
        .map(Todo::getLabel)
        .collect(toList());

    assertThat("New todo has not been added", actualTodos, is(expectedTodos));
  }
}
