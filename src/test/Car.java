package test;

public class Car {

    String brand;
    String color;
    double weight;
    double height;
    int model;

    public Car() {

    }

    public Car(String brand, String color, double weight, double height, int model) {
        this.brand = brand;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", model=" + model +
                '}';
    }
}
