package com.CN.RestAssured;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import javafx.print.Collation;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;


public class TestClass {

    @Test
    public void mytest(){
        //Response is an interface
       Response res = given().baseUri("https://reqres.in")
                             .contentType(ContentType.JSON).basePath("/api/users?page=1").
                      when().get().
                      then().body("data.email",hasItems("george.bluth@reqres.in", "janet.weaver@reqres.in", "emma.wong@reqres.in", "eve.holt@reqres.in", "charles.morris@reqres.in", "tracey.ramos@reqres.in" ),
                       "data.email",hasSize(6), "data[0].email",equalTo("george.bluth@reqres.in")).
                       body("data[0].email",contains("george.bluth@reqres.in")).
                       body("data.email",containsInAnyOrder("george.bluth@reqres.in", "janet.weaver@reqres.in", "emma.wong@reqres.in", "eve.holt@reqres.in", "charles.morris@reqres.in", "tracey.ramos@reqres.in" )).
                       body("data.email",everyItem(startsWith("g"))).
                       body("data[0]",hasKey("email")).
                       body("data[0]",is(not("email"))).extract().response();
   //    System.out.println(res.getStatusCode());
   //     System.out.println(res.getBody().prettyPrint());
    }

}
