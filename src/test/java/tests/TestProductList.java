package tests;

import io.restassured.response.Response;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import services.ProductListService;

public class TestProductList {
    @Test
    public void testGetProductList(){
        ProductListService productListService=new ProductListService();
        Response response=productListService.getAllProductList();
        Assert.assertEquals(200,response.statusCode());
    }
    @Test
    public void testPostToProductList(){
        ProductListService productListService = new ProductListService();
        Response response = productListService.
                postToProductList("{\"name\":\"mohamed\"}");
        Assert.assertEquals(200,response.statusCode());
    }
}
