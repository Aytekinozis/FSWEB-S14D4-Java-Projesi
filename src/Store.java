import com.workintech.product.Bread;
import com.workintech.product.Chocolate;
import com.workintech.product.Coke;
import com.workintech.product.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("cuklat",5,"mukemmel",50);
        products[1] = new Bread("somun",10,"crispy");
        products[2] = new Coke("diet",20,"fresh","Coca");
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
    for (ProductForSale product : products){
        product.showDetails();
    }
    }
}