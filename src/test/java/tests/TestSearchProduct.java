package tests;

import io.restassured.response.Response;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import services.SearchProductService;

public class TestSearchProduct {
    @Test
    public void testSearchProductWithValidItem(){
        SearchProductService searchProductService = new SearchProductService();
        Response response = searchProductService
                .postProductSearch(
                        "{\"search_product\":\"Polo\"}"
                );
        Assert.assertEquals(200,response.statusCode());
    }
}
