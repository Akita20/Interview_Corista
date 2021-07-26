package api_Corista.apiTesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class PlayStationMainPage {
    //https://gmedia.playstation.com
    @BeforeAll
    public static void init(){
        baseURI     = "https://gmedia.playstation.com";
        basePath    = "/is/image/SIEPDC/fifa-22-logo-black-01-ps4-ps5-en-23jun21?$800px--t$" ;
    }
    @AfterAll
    public static void cleanup(){
        reset();
    }

    @DisplayName("GET /image with name query param")
    @Test
    public void testMainPageLogin(){
       given()
              .log().uri().
               when().
               get(basePath).
               then()
               .log().all()
               .statusCode(200)
               .header("Content-Type","image/jpeg")
               .contentType("image/jpeg");

    }


}
