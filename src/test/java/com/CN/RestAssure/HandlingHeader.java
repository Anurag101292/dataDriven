package com.CN.RestAssure;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class HandlingHeader {

    //What are Header-->Header are parameter which we send along with request sendinf to authentiacte users.
    //iana.org
    @Test
    public void header() {
        given().baseUri("www.facebook.com").header("header", "value1").header("Accept", "*/*").
                when().get("path").
                then().log().all().
                assertThat().statusCode(200);
    }
    @Test
    public void multipleheader() {

        Header h1 = new Header("header","value1");
        Header h2 = new Header("Accept","*/*");
        Headers hs = new Headers(h1,h2);
        given().baseUri("www.facebook.com").headers(hs).
                when().get("path").
                then().log().all().
                assertThat().statusCode(200);
    }
    @Test
    public void multiple_header_using_map(){
        HashMap<String,String> hm = new HashMap<>();
                hm.put("header","value1");
                hm.put("Accept","*/*");
        given().baseUri("www.facebook.com").headers(hm).
                when().get("path").
                then().log().all().
                assertThat().statusCode(200).header("header","value1");//validate the header in assert
    }
}
