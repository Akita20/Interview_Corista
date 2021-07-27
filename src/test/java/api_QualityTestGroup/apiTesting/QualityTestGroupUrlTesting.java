package api_QualityTestGroup.apiTesting;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;

public class QualityTestGroupUrlTesting {
    @Test
    public void openMainPageTest(){
        //Get playStation URL
        //save the response into a object with type Response
        Response response=get("https://gmedia.playstation.com/is/image/SIEPDC/fifa-22-logo-black-01-ps4-ps5-en-23jun21?$800px--t$");
        //extracting information from Response object
        //getting status code
        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("response.getStatusCode() = " + response.getStatusCode());

        //getting specific header
        System.out.println("response.getHeader(\"access-control-allow-origin\") = " + response.getHeader("access-control-allow-origin"));
        System.out.println("response.header(\"Date\") = " + response.header("Date"));

        //getting content type header using ready method
        System.out.println("response.contentType() = " + response.contentType());
        System.out.println("response.getContentType() = " + response.getContentType());

        //getting the time for execution
        System.out.println("response.time() = " + response.time());
        System.out.println("response.getTime() = " + response.getTime());
    }
}
