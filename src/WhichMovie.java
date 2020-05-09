import java.io.File;
import java.util.Scanner;

public class WhichMovie {
    static String selectedMovie() throws Exception {
        File movieFile = new File("movies.txt");
        int lines = 0; // number of movies
        int i = 0; // number of letters in string
         Scanner scanList = new Scanner(movieFile);
        while (scanList.hasNextLine()) {
            scanList.nextLine();
            lines++;
        }
         String [] movieList = new String[lines];

        Scanner movieScan = new Scanner(movieFile);
        while (movieScan.hasNextLine()) {
            movieList[i] = movieScan.nextLine();
            i++;
        }

        int index = (int)(Math.random() * lines);
         String movie = movieList[index];

        return movie;

    }
}

