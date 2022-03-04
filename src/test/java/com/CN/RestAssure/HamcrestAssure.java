package com.CN.RestAssure;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestAssure {

    @Test
    public void hamcrest_Assert(){

      String id =  given().baseUri("https://reqres.in/").header("content-type","application/json").
        when().get("api/users?page=2").then().statusCode(200).assertThat().extract().response().
                path("data[0].id");
    }
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

    @Test
    public void fetch_individualresp(){
        Response resp=given().baseUri("https://reqres.in/").header("content-type","application/json").
                       when().get("api/users?page=2").then().assertThat().statusCode(200).extract().response();
                       System.out.print(resp.path("data[0].email").toString());
    }
}
//
//allOf - matches if all matchers match (short circuits)
//
//        anyOf - matches if any matchers match (short circuits)
//
//        not - matches if the wrapped matcher doesn’t match and vice
//
//        equalTo - test object equality using the equals method
//
//        is - decorator for equalTo to improve readability
//
//        hasToString - test Object.toString
//
//        instanceOf, isCompatibleType - test type
//
//        notNullValue, nullValue - test for null
//
//        sameInstance - test object identity
//
//        hasEntry, hasKey, hasValue - test a map contains an entry, key or value
//
//        hasItem, hasItems - test a collection contains elements
//
//        hasItemInArray - test an array contains an element
//
//        hasProperty - checks if a Java Bean has a certain property can also check the value of this property
//
//        closeTo - test floating point values are close to a given value
//
//        greaterThan, greaterThanOrEqualTo, lessThan, lessThanOrEqualTo
//
//        equalToIgnoringCase - test string equality ignoring case
//
//        equalToIgnoringWhiteSpace - test string equality ignoring differences in runs of whitespace
//
//        containsString, endsWith, startsWith - test string mat
