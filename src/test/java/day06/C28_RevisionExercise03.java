package day06;

import baseUrls.DummyRestBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class C28_RevisionExercise03 extends DummyRestBaseUrl {
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

        Response response = given(spec).when().get("{first}");

        JsonPath json = response.jsonPath();

        //There are 24 employees
        int numberOfEmployees = json.getList("data.id").size();
        assertEquals(24,numberOfEmployees);

        //"Tiger Nixon" and "Garrett Winters" are among the employees
        List<String> employeeNames = json.getList("data.employee_name");
        assertTrue(employeeNames.contains("Tiger Nixon"));
        assertTrue(employeeNames.contains("Garrett Winters"));

        //The greatest age is 66
        List<Integer> employeeAges = json.getList("data.employee_age");

        int maxAge = 0;
        for (Integer age:employeeAges){
            if (age>maxAge){
                maxAge =age;
            }
        }
        assertEquals(66,maxAge);

        //The name of the lowest age is "Tatyana Fitzpatrick"
        int minAge = 1000;
        for (Integer age: employeeAges){
            if (age<minAge){
                minAge = age;
            }
        }
        Object nameOfYoungest = json.getList("data.findAll{it.employee_age=="+minAge+"}.employee_name").get(0);
        assertEquals("Tatyana Fitzpatrick",nameOfYoungest);

        //Total salary of all employees is 6,644,770
        List<Integer> salaryList =json.getList("data.employee_salary");
        Integer sumOfSalary = 0;
        for (Integer salary:salaryList){
            sumOfSalary+=salary;
        }

        assertEquals("6644770",sumOfSalary+"");

    }

}
