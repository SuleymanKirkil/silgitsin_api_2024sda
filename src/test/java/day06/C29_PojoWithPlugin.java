package day06;

import baseUrls.PetStoreBaseUrl;
import io.restassured.response.Response;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import pojos.petstore.CategoryPojo;
import pojos.petstore.PetPojo;
import pojos.petstore.TagsPojo;
import utils.ObjectMapperUtils;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class C29_PojoWithPlugin extends PetStoreBaseUrl {

    int PetId;
    PetPojo payload2;

    @Test
    public void createPetTest(){
        PetId =12;
    // Set Url
        spec.pathParam("first","pet");

        String payloadStr = """
                {
                  "id": 12,
                  "category": category,
                  "name": "doggie",
                  "photoUrls": urls,
                  "tags": tags,
                  "status": "available"
                }""";

        //PetPojo payload = ObjectMapperUtils.convertJsonToJava(payloadStr, PetPojo.class);

        // 2nd Way:

        TagsPojo tag1 = new TagsPojo(1,"Fast");
        TagsPojo tag2 = new TagsPojo(2,"Cute");
        List<TagsPojo> tags = new ArrayList<>();
        tags.add(tag1);
        tags.add(tag2);
        List<String> urls = new ArrayList<>();
        urls.add("string1");
        urls.add("string2");
        CategoryPojo category = new CategoryPojo(1,"Dog");

        payload2 = new PetPojo(PetId,category,"doggie",urls,tags,"available");


        Response response = given(spec).body(payload2).when().post("{first}");
        response.prettyPrint();
        response
                .then()
                .statusCode(200);

    }

    @Test(dependsOnMethods = "createPetTest",priority = 1)
    public void getPetTest(){
        spec.pathParams("first","pet","second",PetId);

        Response response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        assertEquals(response.statusCode(),200);
    }

    @Test(dependsOnMethods = "createPetTest",priority = 2)
    public void updatePet(){
        spec.pathParam("first","pet");
        payload2.setStatus("pending");
        payload2.getTags().get(1).setName("Super");

        Response response = given(spec).body(payload2).when().put("{first}");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
