package com.CN.RestAssured;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;


public class TestClass {

    @Test
    public void mytest(){
        given().
                when().
                get().
                then().
                extract().response();
    }

    public static void main(String[] args) {
        System.out.print("Anurag");
    }
}
