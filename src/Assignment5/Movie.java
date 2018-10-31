package Assignment5;
/**
 * @author Weichen Wang
 * @date 2018/10/28 - 下午7:36
 * @description: a 1: Rewrite the Movie class and make the instance variable private
 * 2: Write appropriate getter and setter methods for each of the private data members
 * 3: Write an appropriate constructor
 */
public class Movie {
    // declare three instances variables but don't assign a value.
    private String title; // data members, make the instance variable private
    private String genre;
    private int rating;

    // add the getTitle method to get the title values and output
    public void playIt() {
        System.out.println(getTitle() + " - Now Playing");
    }

    // default Constructor
    public Movie() {
        title = "unassigned";
        genre = "unassigned";
        rating = 0;
    }

    // making a constructor with parameters to set value.
    // Overloading Constructor
    public Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    // creating a getter & setter method per movie variable.
    // get & set title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
