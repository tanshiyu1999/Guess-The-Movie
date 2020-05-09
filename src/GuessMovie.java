import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        boolean hasWon = false;
        Scanner guessLetter = new Scanner(System.in);
        ArrayList wrongList = new ArrayList();
        int counter = 0;



        for (int w = 10; !hasWon; w-- ) {
            System.out.println(String.join("", newArr));
            System.out.println("Guess a letter, " + "letter(s) gotten wrong: " + String.join(", ", wrongList));
            System.out.println("You have " + w + " tries left.");
            String letter = guessLetter.nextLine();
            if ( movie.indexOf(letter) == -1) {
                System.out.println("No such letter, try again.");
                wrongList.add(letter);
            } else if (movie.indexOf(letter) != -1 ) {
                //this replace the _ with the letter, remember there might be multiple shit with the letter
                w++;
                while (movie.indexOf(letter) != -1) {
                    newArr[movie.indexOf(letter)] = letter;
                    movie = movie.substring(0, movie.indexOf(letter)) + '*' + movie.substring(movie.indexOf(letter) + 1);
                    counter++;
                }
            }

            if(w == 1) {
                break;
            } else if (movieArr.length == counter + movie.replaceAll("[^ ]", "").length()  ) {
                hasWon = true;
            }
        }
    if (hasWon) {
        System.out.println("WINNER WINNER CHICKEN DINNER");
    } else {
        System.out.println("You suck");
    }

    }
}
