package pl.chojnacki.lesson4.homework.task8;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final long pesel;

    public Person(String name, String surname, long pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pesel == person.pesel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }

}
