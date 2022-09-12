package product;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void list_WhenreturnAllProducts(){
        //GIVEN
        Product product1 = new Product("Pan","1");
        Product product2 = new Product("Refrigerator","2");
        Product product3 = new Product("Desk","3");

       List<Product> productList=  List.of(product1, product2,product3);
       ProductRepo productRepo = new ProductRepo();
        //WHEN

        List<Product> actual =  productRepo.list();
        // THEN
        assertEquals(productList,actual);
    }

    @Test
    void get_WhenGivenExistingIdReturnOneproduct(){
        //GIVEN
        Product product1 = new Product("Pan","1");
        Product product2 = new Product("Refrigerator","2");
        Product product3 = new Product("Desk","3");

        List<Product> productList=  List.of(product1, product2,product3);
        ProductRepo productRepo = new ProductRepo();
        //WHEN
        Product actual = productRepo.get("3");
        // THEN
        Product expected = new Product("Desk","3");
        assertEquals(expected,actual);

    }

}