package com.CN.RestAssure;

import io.restassured.config.LogConfig;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

public class LoggingRes {

    @Test
    public void req_resp_logg(){
        given().baseUri("https://reqres.in/").header("","").
                config(config.logConfig(LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails())).
                //suppose I done need to send 2 times log().all() use above line
                //Suppose i dont need to show header because header is sensitive info in this stage this config helps
                config(config.logConfig(LogConfig.logConfig().blacklistHeader("",""))).
                log().all().
        when().
                get("api/users?page=2").
                then().log().all().
                log().cookies().
                log().ifError().
                log().ifValidationFails().
                assertThat().statusCode(200);
    }
}
