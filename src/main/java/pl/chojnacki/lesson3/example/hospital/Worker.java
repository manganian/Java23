package pl.chojnacki.lesson3.example.hospital;

public class Worker extends Employee {

    @Override
    public double earnPayment() {
        return basicPayment;
    }

}