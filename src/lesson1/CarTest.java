package lesson1;

public class CarTest {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car(23, "ferrari");
        car.refuel(80);
        car.go();

//        Car.Engine engine = new Car().new Engine("BMW"); tworzenie nowego silnika poza klasą CAR
        // raczej nieprzydayne
    }
}
