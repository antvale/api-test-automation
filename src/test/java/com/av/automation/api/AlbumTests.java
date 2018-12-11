package com.av.automation.api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.apache.http.HttpStatus;
import org.junit.Test;



public class AlbumTests {

    private String ENDPOINT_GET_ALBUM_BY_CODE = "https://jsonplaceholder.typicode.com/albums";

    @Test
    public void testAlbumGetByCode(){
        String code = "1";

                given()
                .when().
                get(ENDPOINT_GET_ALBUM_BY_CODE+"/1")
                .then().
                statusCode(HttpStatus.SC_OK).
                body("title", equalTo("quidem molestiae enim"));
    }


}
