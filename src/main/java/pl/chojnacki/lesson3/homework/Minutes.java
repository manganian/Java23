package pl.chojnacki.lesson3.homework;

public class Minutes {
    public static int convertMinutesToSeconds(int minutes) {
        if (minutes > 0) {
            return minutes*60 ;
        }
        else {
            return 0;
        }
    }
}
