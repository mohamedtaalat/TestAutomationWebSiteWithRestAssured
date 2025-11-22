package services;
import base.BaseService;
import io.restassured.response.Response;

public class ProductListService extends BaseService {
    public static String BASE_PATH = "api/productsList";
    public Response getAllProductList(){
        return getRequest(
                BASE_PATH
        );
    }
    public Response postToProductList(String payLoad){
        return postRequest(
                payLoad,
                BASE_PATH
        );
    }
}
