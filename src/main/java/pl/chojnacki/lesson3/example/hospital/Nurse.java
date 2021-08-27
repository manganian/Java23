package pl.chojnacki.lesson3.example.hospital;

public class Nurse extends Employee{

    String level;

    @Override
    public double earnPayment() {
        return 2*basicPayment;
    }

}
