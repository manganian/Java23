package pl.chojnacki.lesson4.example;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
        Car yourCar = new Car();
        Car car3 = myCar;
        Car bmw = new Car(4,"BMW","5");

        System.out.println("MyCar: " + myCar.drive(50));
        System.out.println("Car3: " + car3.drive(50));
        System.out.println("YourCar: " + yourCar.drive(50));

        myCar.horn();

        System.out.println(bmw.mileage);
        System.out.println(bmw.doors);
        System.out.println(bmw.brand);
        System.out.println(bmw.model);

        System.out.println(myCar.mileage);
    }
}
