package day05;

import baseUrls.JsonPlaceHolderBaseUrl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.restassured.internal.mapping.GsonMapper;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import test_data.JsonPlaceHolderTestData;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class C21_ObjectMapperMap extends JsonPlaceHolderBaseUrl {

/*
         Given
           1) https://jsonplaceholder.typicode.com/todos
           2) {
                "userId": 55,
               "title": "Tidy your room",
               "completed": false
               }
        When
            I send POST Request to the Url
        Then
            Status code is 201
        And
            response body is like {
                                    "userId": 55,
                                    "title": "Tidy your room",
                                    "completed": false,
                                    "id": 201
                                    }

Note: Use map and POJO seperately
*/

    @Test
    public void test() throws JsonProcessingException {
        // Set Url
        spec.pathParam("first","todos");

        // Set expected data
        String expectedString = """
                {
                "userId": 55,
                "title": "Tidy your room",
                "completed": false,
                "id": 201,
                }""";
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> payload2 = objectMapper.readValue(expectedString,Map.class);
        Map<String,Object> payload = JsonPlaceHolderTestData.expectedDataMap(55,"Tidy your room",false);

        System.out.println("payload2 = " + payload2);
        System.out.println("payload = " + payload);
        // Sent request and get response
        Response response = given(spec).body(payload).when().post("{first}");
        response.prettyPrint();

        // Do assertions
        Map<String,Object> actualData;
        try {
            actualData = objectMapper.readValue(response.asString(),Map.class);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        System.out.println("actualData = " + actualData);
    }
}
