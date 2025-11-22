package tests;

import io.restassured.response.Response;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import services.BrandListService;

public class TestBrandList {
    @Test
    public void testGetBrandsList(){
        BrandListService brandListService = new BrandListService();
        Response response = brandListService.getAllBrandsList();
        Assert.assertEquals(200,response.statusCode());
    }
    @Test
    public void testPutToBrandList(){
        BrandListService brandListService = new BrandListService();
        Response response = brandListService
                .putInBrandList("{\"name\":\"mohamed\"}");
        Assert.assertEquals(200,response.statusCode());
    }
}
