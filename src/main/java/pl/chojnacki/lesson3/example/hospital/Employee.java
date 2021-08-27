package pl.chojnacki.lesson3.example.hospital;

public abstract class Employee {

    protected final double basicPayment = 1000;

    private String name;
    private String surname;

    public abstract double earnPayment();

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

}