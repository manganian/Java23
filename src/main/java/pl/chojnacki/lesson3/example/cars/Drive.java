package pl.chojnacki.lesson3.example.cars;

public interface Drive {

    default void forward() {
        System.out.println("error");
    }

    void back();
}
