package pl.chojnacki.lesson2.homework;

public class Movie {
    private String title;
    private String directorsName;
    private String directorsSurname;
    private int durationInMinutes;
    private int yearOfProduction;

    public Movie(String title, String directorsName, String directorsSurname, int durationInMinutes, int yearOfProduction) {
        this.title = title;
        this.directorsName = directorsName;
        this.directorsSurname = directorsSurname;
        this.durationInMinutes = durationInMinutes;
        this.yearOfProduction = yearOfProduction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectorsName() {
        return directorsName;
    }

    public void setDirectorsName(String directorsName) {
        this.directorsName = directorsName;
    }

    public String getDirectorsSurname() {
        return directorsSurname;
    }

    public void setDirectorsSurname(String directorsSurname) {
        this.directorsSurname = directorsSurname;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}

