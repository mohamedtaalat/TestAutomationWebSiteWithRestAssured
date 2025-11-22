package services;

import base.BaseService;
import io.restassured.response.Response;

public class SearchProductService extends BaseService {
    private static final String BASE_PATH = "api/searchProduct";
    public Response postProductSearch(String payLoad){
        return postRequest(
                payLoad,
                BASE_PATH
        );
    }
}
