package pl.chojnacki.lesson8.homework.task4;

public class Person implements Comparable<Person>{
    private final String name;
    private final String surname;
    private final int yearOfBirth;
    private final int height;
    private final double weight;

    public Person(String name, String surname, int yearOfBirth, int height, double weight) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.yearOfBirth, o.yearOfBirth);
    }
}
