package onlineshopping.java;
import java.util.list;
import java.util.ArrayList;
import java.util.List;
public class productController<Product> {
    List<Product> cartItems = new ArrayList<Product>();
    
    public void addProductToCartByPID(int pid) {
    	productController product = getProductByProductID(pid);
        addToCart(product);
    }

    private productController getProductByProductID(int pid) {
    	productController product = null;
        List<Product> products = new productController().getProducts();
        for (Product prod: products) {
            if (prod.getPid() == pid) {
                product = prod;
                break;
            }
        }
        return product;
    }

    private void addToCart(productController product) {
        cartItems.add((Product) product);
    }

    public void removeProductByPID(int pid) {
        productController prod = getProductByProductID(pid);
        cartItems.remove(prod);
    }

    void printCartItems() {
        for (Product prod: cartItems) {
            System.out.println (getName());
        }
    }
    
}
