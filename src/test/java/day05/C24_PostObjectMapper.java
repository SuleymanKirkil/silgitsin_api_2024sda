package day05;

import baseUrls.BookerBaseUrl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class C24_PostObjectMapper extends BookerBaseUrl {

    /*
       /*
   Given
       1) https://restful-booker.herokuapp.com/booking
       2) {
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
   When
       I send POST Request to the Url
   Then
       Status code is 200
       And response body should be like
       {
       "bookingid": 2243,
       "booking":{
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
        }
*/
    @Test
    public void test(){
        spec.pathParam("first","booking");

        String expecredString = """
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












    }

}
