import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class GuessMovie {
    public static void main(String [] args) throws Exception{

        String movie = WhichMovie.selectedMovie();

        String[] movieArr = movie.split("");
        System.out.println(movieArr);

        String[] newArr = new String[movieArr.length];

        for (int k = 0; k < movieArr.length; k++) {
            if (movieArr[k].equals(" ")) {
                newArr[k] = " ";
            } else {
                newArr[k] = "_";
            }
        }

        boolean hasWon = false;
        Scanner guessLetter = new Scanner(System.in);

        for (int w = 10; !hasWon; w-- ) {
            System.out.println(String.join("", newArr));
            System.out.print("Guess a letter: ");
            String letter = guessLetter.nextLine();
            if ( movie.indexOf(letter) == -1) {
                System.out.println("");;
            }


            if(w == 1) {
                break;
            }

        }

    }
}
