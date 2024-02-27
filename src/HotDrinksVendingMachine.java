import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{

    private final List<Product> productList;
    private int money;

    public HotDrinksVendingMachine() {
        this.productList = initProduct();
        this.money = 0;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product: productList) {
            if(product.getName().equals(name)){
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }



    public HotDrink getProduct(String name, int price, float temperature){
        for (Product product: productList) {
            if(product instanceof HotDrink){
                if(product.getName().equals(name) && (product.getPrice() == price) &&
                        ((HotDrink) product).getTemperature() == temperature){
                    return (HotDrink) product;
                }
            }
        }
        return null;
    }


    private List<Product> initProduct(){
        List<Product> products = new ArrayList<>();
        products.add(new HotDrink("Coffee", 100, 80));
        products.add(new HotDrink("Coffee", 200, 10));
        products.add(new HotDrink("Tea", 70, 90));
        products.add(new HotDrink("Cacao", 80, 85));
        return products;
    }
}
