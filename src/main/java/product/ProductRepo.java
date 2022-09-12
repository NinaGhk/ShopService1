package product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepo {

   private HashMap<Integer,Product> product=new HashMap<>();

    public ProductRepo(HashMap<Integer, Product> product) {
        this.product = product;
    }
    public List<Product> list() (){
      ArrayList<Product> products = new ArrayList<>(product.values());
        return products;
     }

    public Product getId(Integer eins){
        return product.get(eins);
    }

    public List<Product> list() {
        HashMap<Object, Object> products;
        return new ArrayList<Product>( products.values());
    }
}