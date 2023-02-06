package Session3;

public class Car {
    private  String name;
    private String brand;
    private int price;
    public Car(){}
    public Car(String brand, String name, int price){
        this.brand=brand;
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
