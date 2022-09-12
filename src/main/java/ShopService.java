import order.OrderRepo;
import product.Product;
import product.ProductRepo;

import java.util.List;

public class ShopService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }
    public List<Product> ListProducts(){
        List<Product> allProducts = productRepo.list();
        return allProducts;
    }
}
