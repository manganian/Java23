package pl.chojnacki.lesson3.homework;

public class Minutes {
    public static String convertMinutestoSeconds(int minutes) {
        if (minutes == 0) {
            return "O minutes equals 0 seconds.";
        }
        else if (minutes > 0) {
        return minutes + " minutes equals " + minutes*60 + " seconds." ;
        }
        else {
           return "Enter a positive number to convert it.";
        }
    }
}
