package rest;

import com.jayway.restassured.RestAssured;
import org.junit.Test;

import java.util.Map;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredTest {

  @Test
  public void canAddNewTodo() {
    RestAssured.baseURI = "http://127.0.0.1:9999";
    String expectedTitle = "Yet another todo item";
    given().log().all()
        .formParam("todo-title", expectedTitle)
    .when().
        post("/todos").
    then().log().all().
        statusCode(200).
        body("html.body.section.section.ul.li.div.label", equalTo(expectedTitle));
  }
}
