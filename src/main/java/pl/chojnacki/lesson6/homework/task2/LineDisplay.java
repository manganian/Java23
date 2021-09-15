package pl.chojnacki.lesson6.homework.task2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LineDisplay {
    public void display() {
        {
            try {
                Path file = Paths.get("src/main/resources/data.txt");
                long counter = Files.lines(file).count();

                int n = 0;
                while (n < counter) {
                    String line = Files.readAllLines(Paths.get("src/main/resources/data.txt")).get(n);
                    System.out.println(line);
                    n = n + 2;
                }

            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}

