public class HotDrink extends Product{
     protected float temperature;

    public HotDrink(String name, int price) {
        super(name,price);
    }

    public HotDrink(String name, int price, float temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", temperature=" + temperature +
                '}';
    }

    public float getTemperature() {
        return temperature;
    }
}
