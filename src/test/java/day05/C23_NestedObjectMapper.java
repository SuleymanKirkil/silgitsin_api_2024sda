package day05;

import baseUrls.BookerBaseUrl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import pojos.BookingPojo;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class C23_NestedObjectMapper extends BookerBaseUrl {

/*
        Given
            https://restful-booker.herokuapp.com/booking/466
        When
            I send GET Request to the url
        Then
            Response body should be like that;
            {
                "firstname": "Jane",
                "lastname": "Doe",
                "totalprice": 111,
                "depositpaid": true,
                "bookingdates": {
                    "checkin": "2018-01-01",
                    "checkout": "2019-01-01"
                },
                "additionalneeds": "Extra pillows please"
            }
*/

    @Test
    public void test() throws JsonProcessingException {
        // Set expected data
        spec.pathParams("first","booking"
        ,"second",466);

        // Set Expected data
        String expectedString = """
                {
                    "firstname": "Jane",
                    "lastname": "Doe",
                    "totalprice": 111,
                    "depositpaid": true,
                    "bookingdates": {
                        "checkin": "2018-01-01",
                        "checkout": "2019-01-01"
                    },
                    "additionalneeds": "Extra pillows please"
                }""";

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> expectedMap =  objectMapper.readValue(expectedString, Map.class);
        BookingPojo booking = objectMapper.readValue(expectedString, BookingPojo.class);

        System.out.println("expectedMap.get(\"firstname\") = " + expectedMap.get("firstname"));
        System.out.println("booking.getFirstname() = " + booking.getFirstname());

        System.out.println("((Map)expectedMap.get(\"bookingdates\")).get(\"checkin\") = " + ((Map) expectedMap.get("bookingdates")).get("checkin"));
        System.out.println("booking.getBookingdates().getCheckin() = " + booking.getBookingdates().getCheckin());

        given(spec).when().get("{first}/{second}");

    }
}
