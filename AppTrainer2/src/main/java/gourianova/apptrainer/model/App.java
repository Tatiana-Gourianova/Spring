package gourianova.apptrainer.model;

public class App {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String title;
    private int year;
    private String genre;

    @Override
    public String toString() {
        return "Title "+getTitle()+" produced "+ getYear()+" genre " + getGenre();
    }
}
