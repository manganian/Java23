package pl.chojnacki.lesson3.example.cars;

public class Bmw extends Car {

    boolean turnSignals = false;

    Bmw(final boolean turnSignals){
        this.turnSignals = turnSignals;
    }

    Bmw(final int doors, final Brand brand, final String model, final boolean turnSignals){
        super(doors,brand,model);
        this.turnSignals = turnSignals;
    }
}
