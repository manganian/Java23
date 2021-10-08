package pl.chojnacki.lesson11.task3;

public class CinemaHall {
    private String name;
    private TypeOfCinemaHall typeOfHall;

    public CinemaHall(String name, TypeOfCinemaHall typeOfHall) {
        this.name = name;
        this.typeOfHall = typeOfHall;
    }

    public String getName() {
        return name;
    }

    public TypeOfCinemaHall getTypeOfHall() {
        return typeOfHall;
    }
}
