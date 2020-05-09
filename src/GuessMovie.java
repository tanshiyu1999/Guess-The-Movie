import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class GuessMovie {
    public static void main(String [] args) throws Exception{

        String movie = WhichMovie.selectedMovie();

        String[] movieArr = movie.split("");

        String[] newArr = new String[movieArr.length];

        for (int k = 0; k < movieArr.length; k++) {
            if (movieArr[k].equals(" ")) {
                newArr[k] = " ";
            } else {
                newArr[k] = "_";
            }
        }

        for (int w = 10; 10 - 9) {

        }

        System.out.println(String.join("", newArr));











    }
}

