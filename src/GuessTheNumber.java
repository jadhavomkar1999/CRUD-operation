import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int UserInput;
    int NoOfAttempt = 0;

    Game(){
        Random rd = new Random();
        number = rd.nextInt(100);
    }
    void UserChoice(){
        System.out.println("Enter your guess: ");
        Scanner sc = new Scanner(System.in);
        UserInput = sc.nextInt();
    }

    boolean isCorrect(){
        NoOfAttempt++;
        if(UserInput == number){
            System.out.println("You guess the number i.e "+number+" in "+NoOfAttempt+" attempt.");
            return true;
        }
        else if (UserInput > number) {
            System.out.println("Enter small number.");

        }
        else if(UserInput < number){
            System.out.println("Enter large number.");
        }
        return false;
    }

}

public class GuessTheNumber {
    public static void main(String[] args) {

        Game g = new Game();
        boolean s = false;

        while(!s){
            g.UserChoice();
            s = g.isCorrect();
            //System.out.println(s);
        }

    }
}
