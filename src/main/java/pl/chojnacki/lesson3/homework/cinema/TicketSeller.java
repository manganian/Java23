package pl.chojnacki.lesson3.homework.cinema;

public class TicketSeller extends BaseEmployee {

    protected final double DEFAULT_SALARY_TICKET_SELLER = 3000;

    public TicketSeller(String name, String surname, int yearOfHire) {
        super(name, surname, yearOfHire);
    }

    @Override
    public double calculateMonthlySalary() {
        return DEFAULT_SALARY_TICKET_SELLER;
    }

    @Override
    public double getBaseSalary() {
        return DEFAULT_SALARY_TICKET_SELLER;
    }
}
