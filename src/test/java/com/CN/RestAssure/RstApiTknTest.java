package com.CN.RestAssure;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.LogConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

public class RstApiTknTest {
    public static Header h = new Header("Anurag","Anu");
    public static RequestSpecification perfectAptest(){
        RequestSpecBuilder rs = new RequestSpecBuilder();
      return  rs.setBaseUri("https://facebook.com").setBasePath("/friends/list").setContentType(ContentType.JSON).
              //  addFilter(new AllureRestAssured())
        setConfig(config().logConfig(LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
                .build(); }

    public static Response get1(String path,String token){
        return given(perfectAptest()).auth().oauth2(token).when().get(path).then().spec(getResponseSpec()).
                extract().response(); }

    public static Response post(String path, String token, Object requestPlaylist){
        return given(perfectAptest()).body(requestPlaylist).header(h).auth().oauth2(token).when().post(path).
                then().spec(getResponseSpec()).extract().response();
    }
    public static Response update(String path, String token, Object requestPlaylist){
        return given(perfectAptest()).auth().oauth2(token).body(requestPlaylist).when().put(path).then()
                .spec(getResponseSpec()).extract().response();
    }
    public static ResponseSpecification getResponseSpec(){
        return new ResponseSpecBuilder().log(LogDetail.ALL).build();
    }

//    client_id=18fdbf0c328448989601580ce4e0d7ca
//    client_secret=f31ab0445ba241dd8a7fdef9be2fa081
//    refresh_token=AQCzj--buTG0dudUBRtoF2n3DZrOEnaqKPS9myv8gmcxW6rOnp8vIV_p9XLbSAdzAkZXDujoAqYcFXGU96ctW_1v5Tezc6xXz-qjcHp4JyYOG7CjBGoF81BTKVbzxInqmD8
//    grant_type=refresh_token
//    user_id=c0sb51wjod0fli2g7k0r2lc5e
}
