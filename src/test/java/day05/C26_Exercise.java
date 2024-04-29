package day05;

import baseUrls.DummyRestBaseUrl;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C26_Exercise extends DummyRestBaseUrl {
    /*
    Given
        https://dummy.restapiexample.com/api/v1/employees
    When
        User sends Get Request to the Url
    Then
        Status code is 200
    And
        There are 24 employees
    And
        "Tiger Nixon" and "Garrett Winters" are among the employees
    And
        The greatest age is 66
    And
        The name of the lowest age is "Tatyana Fitzpatrick"
    And
        Total salary of all employees is 6,644,770
 */
    @Test
    public void test(){
        spec.pathParam("first","employees");

        given(spec).when().get("{first}").prettyPrint();
    }
}
