package day04;

import baseUrls.BookerBaseUrl;
import org.testng.annotations.Test;
import pojos.BookerPojo;
import pojos.BookingDatesPojo;

public class C19_GetRequestNestedPojo extends BookerBaseUrl {
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
    public void nestedPostPojoTest(){
        // Set Url
        spec.pathParams("first","booking"
                ,"second",466);

        // Set Expected Data

        // When dealing with nested structures ,first create inner structure

        BookingDatesPojo bookingDates = new BookingDatesPojo("2018-01-01","2019-01-01");
        BookerPojo payLoad =new BookerPojo("Jane","Doe",111,true,bookingDates,"Extra pillows please");













    }




}
