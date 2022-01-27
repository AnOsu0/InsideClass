package lesson1;

public class Car {
    private int fuel;
    private Engine engine;

    public Car (){

    }
    public Car(int fuel, String engineType) {
        this.fuel = fuel;
        this.engine = new Engine(engineType);
        System.out.println("Utworzono nowy samochód z silnikiem: " + engine.EngineType);
    }

    public void refuel (int liters){
        fuel += liters;
    }

    public void go () throws InterruptedException {
        while (fuel>0){
            engine.consumeFuel();
            System.out.println("Aktualny stan paliwa: " + fuel);
            Thread.sleep(1000);
        }
        System.out.println("Brak Paliwa");
    }

   private class Engine {
        private String EngineType;
        private static final int FUEL_CONSUMPTION = 20;

       public Engine(String engineType) {
           EngineType = engineType;
       }

       public void consumeFuel (){
           if (fuel >= FUEL_CONSUMPTION){
               fuel -= FUEL_CONSUMPTION;
           } else {
               fuel = 0;
           }
       }
   }
}
