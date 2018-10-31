package Assignment5;

import java.util.Scanner;
/**
 * @author Weichen Wang
 * @date 2018/10/28 - 下午7:47
 * @describe: b: 1: main() method should in MovieTester class
 * 2: create three instances of the Movie class and stores them in an array
 * 3: tester class should use a for loop to set the title, genre and rating of the Movie objects
 * 4: should also use a for loop to traverse the array and display the title, genre, rating for each element of the array
 * 5: call the playIt() method for each object.
 */
public class MovieTester {

    public static void main(String[] args) {
        // declare a Movie array variable, and create a new Movie array with a length of 3
        // and assign it to the previously declared Movie[] variable movies.
        Movie[] movies = new Movie[3];

        // use first for loop to set the title, genre and rating of the Movie objects.
        for (int i = 0; i < 3; i++) {
            // declare a movie reference variable and create a new Movie object.
            // assign the Movie obejct to the reference variables.
            Movie movie = new Movie();

            // set the title value
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter the title of movie " + (i + 1) + ": ");
            // read the next line from the stream (entered from the keyboard) and store it in a String variable named title.
            String title = sc.nextLine();
            movie.setTitle(title); // use the setter method assign value to movie.

            // set the genre value
            System.out.print("Please enter the genre of movie " + (i + 1) + ": ");
            // read the next line from the stream (entered from the keyboard) and store it in a String variable named genre.
            String genre = sc.nextLine();
            movie.setGenre(genre); // use the setter method assign value to movie.

            // set the rating value
            System.out.print("Please enter the rating (1-5) for movie " + (i + 1) + ": ");
            // read the next line from the stream (entered from the keyboard) and store it in a Int variable named rating.
            int rating = sc.nextInt();
            movie.setRating(rating); // use the setter method assign value to movie.

            movies[i] = movie; // assign the movie value to movies array each time in for loop (i++)
            // for example: movie[0] = movie, store the movie values(title,genre,rating) into the  array(when i=0)
            System.out.println();
        }

        System.out.println("\n====================Output=======================");
        // use second for loop to traverse the array and display the title, genre, rating for each element of the array
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i]; // assign the movies[i] array values to movie object

            // use getter method to get title, genre and rating values
            System.out.println("Movie " + (i + 1) + " Title: " + movie.getTitle());
            System.out.println("Movie " + (i + 1) + " Genre: " + movie.getGenre());
            System.out.println("Movie " + (i + 1) + " Rating: " + movie.getRating());
            movies[i].playIt(); // call the playIt() method for each object.
            System.out.println();
        }
    }
}
