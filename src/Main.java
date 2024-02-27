public class Main {
    public static void main(String[] args) {
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        System.out.println(vendingMachine.getProduct("Coffee"));
        System.out.println(vendingMachine.getProduct("Coffee", 200, 10));

    }
}