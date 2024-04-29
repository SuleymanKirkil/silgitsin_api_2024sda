package day05;

import baseUrls.JsonPlaceHolderBaseUrl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.BookingPojo;
import pojos.JsonPlaceHolderPojo;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;

public class C25_Exercise extends JsonPlaceHolderBaseUrl {

    /*
   Given
       https://jsonplaceholder.typicode.com/todos
   When
  I send a GET request to the Url
And
    Accept type is “application/json”
Then
    HTTP Status Code should be 200
And
       There must be a todo like:
           {
               "userId": 1,
               "id": 4,
               "title": "et porro tempora",
               "completed": true
           }
    */
    @Test
    public void test() throws JsonProcessingException {
        spec.pathParam("first","todos");

        String expectedTodoStr = """
                {
                               "userId": 1,
                               "title": "et porro tempora",
                               "completed": true
                           }""";
        int userId = 4;

        ObjectMapper objectMapper = new ObjectMapper();
        JsonPlaceHolderPojo expectedTodo = objectMapper.readValue(expectedTodoStr, JsonPlaceHolderPojo.class);

        Response response = given(spec).when().get("{first}");

        List<JsonPlaceHolderPojo> todoList =objectMapper.readValue(response.asString(), List.class);
        JsonPath json = response.jsonPath();

        Object todo = json.getList("findAll{it.id=="+userId+"}").get(0);
       Map<String,Object> actualTodo = (Map) todo;
        System.out.println("todoStr = " + actualTodo);

        System.out.println("expectedTodo.getUserId() = " + expectedTodo.getUserId());
        System.out.println("todoList.get(userId-1).getUserId() = " + ((JsonPlaceHolderPojo)(todoList.get(userId - 1))).getUserId());

    }
}
