package services;

import base.BaseService;
import io.restassured.response.Response;

public class BrandListService extends BaseService {
    private static final String BASE_PATH = "api/brandsList";
    public Response getAllBrandsList(){
        return getRequest(
                BASE_PATH
        );
    }
    public Response putInBrandList(String payLoad){
        return putRequest(
                payLoad,
                BASE_PATH
        );
    }
}
