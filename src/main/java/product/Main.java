package product;

import order.Order;
import order.OrderRepo;

import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Product> products = List.of(

             new Product("Pan","1");
             new Product("Refrigerator","2");
             new Product("Desk","3");


        )

        ProductRepo productRepo = new ProductRepo(products);
        OrderRepo orderRepo = new OrderRepo();
        ShopService shopService = new ShopService;

        System.out.println(shopService.ListProducts());
        System.out.println((shopService.getProduct("1")));
;


    }
}
