package day02;

import baseUrls.JsonPlaceHolderBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class C09_GroovyLanguage00 extends JsonPlaceHolderBaseUrl {

    /*
    Given
        https://jsonplaceholder.typicode.com/todos
    When
         I send GET Request to the URL
    Then
         1)Status code is 200
         2)Print all ids greater than 190 on the console
           Assert that there are 10 ids greater than 190
         3)Print all 'completeds' whose ids are less than 5 on the console
           Assert that the number of userIds whose ids are less than 5 is 4
         4)Print all titles whose ids are greater than 195
           Assert that "quis eius est sint explicabo" is one of the titles whose id is less than 5
         5)Print id whose title is "quo adipisci enim quam ut ab"
           Assert that id is 8
*/

    @Test
    public void groovyTest() {

        //Set the Url

        //Set the expected data

        //Send the request and get the response

        //Do assertion

//        1)Status code is 200

//        2)Print all ids greater than 190 on the console
//        Assert that there are 10 ids greater than 190




//        3)Print all 'completeds' whose ids are less than 5 on the console
//        Assert that the number of 'completeds' whose ids are less than 5 is 4


//        4)Print all titles whose ids are greater than 195
//        Assert that "quis eius est sint explicabo" is one of the titles whose id is less than 5


//        5)Print id whose title is "quo adipisci enim quam ut ab"
//        Assert that id is 8



    }
}
