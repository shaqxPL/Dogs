public class Car {

//    Stwórz klasę Car, która będzie miała pola: brand, color, engine
    String brand;
    String color;
    double engine;

    public Car() {
    }

    public Car(String brand,String color,double engine){

        this.brand = brand;
        this.color = color;
        this.engine = engine;
    }

    public void move(){
        System.out.println("Car is moving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }


}
