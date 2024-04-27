package day01;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class C01_RequestResponse {

    /*
    Given
        https://restful-booker.herokuapp.com/booking
    When
        User sends a GET Request to the url
    Then
        Print Status Code (should be 200)
    And
        Print Content Type (should be JSON)
    And
        Print Status Line (should be HTTP/1.1 200 OK)
    And
        Print Connection and Date headers on console
    And
        Print all headers on console

*/

    public static void main(String[] args) {

//        https://restful-booker.herokuapp.com/booking

//        User sends a GET Request to the url
        //RestAssured library is used to send request and get the response
        Response response = RestAssured.get("https://restful-booker.herokuapp.com/booking");//get() method will return Response
        //response.prettyPrint();//To see body on console in pretty way we can use prettyPrint() method.

//        HTTP Status Code should be 200
        //Everything we need is in Response container
        int statusCode = response.statusCode();
        System.out.println("statusCode = " + statusCode);//200

//        Content Type should be JSON
        String contentType = response.contentType();
        System.out.println("contentType = " + contentType);

//        Status Line should be HTTP/1.1 200 OK
        String statusLine = response.statusLine();
        System.out.println("statusLine = " + statusLine);

//        Print Connection and Date headers on console
        String connection = response.header("Connection");
        String date = response.header("Date");

        System.out.println("\nconnection = " + connection);
        System.out.println("date = " + date);

//        Print all headers on console
        Headers headers = response.headers();
        System.out.println("\nheaders = " + headers);

    }

}

