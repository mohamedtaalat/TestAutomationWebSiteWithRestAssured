package base;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
public class BaseService {
    private  RequestSpecification requestSpecification;
    private static final String BASE_URL = "https://automationexercise.com/";
    public BaseService(){
        requestSpecification = given().baseUri(BASE_URL);
    }
    public Response postRequest(String payLoad,String endPoint){
        return requestSpecification
                .contentType(ContentType.JSON)
                .body(payLoad)
                .post(endPoint);
    }

    public Response getRequest(String endPoint){
        return requestSpecification
                .contentType(ContentType.JSON)
                .get(endPoint);
    }
    public Response putRequest(String payLoad,String endPoint){
        return requestSpecification
                .contentType(ContentType.JSON)
                .body(payLoad)
                .put(endPoint);
    }
}
