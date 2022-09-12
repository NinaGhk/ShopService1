package order;

import org.junit.jupiter.api.Test;
import product.Product;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void addOrder_WhenGivenOrder_addOrder(){

        //GIVEN
        List<Product> products = new Product("Pan","1");
         new Product("Refrigerator","2"));


        Order order1 = new order ("1", Product);
        OrderRepo orderRepo = new OrderRepo();
        //WHEN
        orderRepo.addOrder(Order "1");
        Order actual = orderRepo.addOrder("1");
        //THEN
        Order expected = new Order(("1",product));
        assertEquals(expected,actual);


    }

}