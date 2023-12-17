import java.util.Random;
import java.util.Scanner;

class Game1{
    public int CompChoice;
    public int UserChoice;

    Game1(){
        Random rd = new Random();
        CompChoice = rd.nextInt(1,4);
    }

    void GetUserInput(){
        System.out.println("1: Rock , 2: Paper, 3: Scissors");
        System.out.print("Enter Your Choice: ");
        Scanner sc = new Scanner(System.in);
        UserChoice = sc.nextInt();
    }

    void GetResult(){
        if(CompChoice == UserChoice){
            System.out.println("Draw...");
            System.out.println("CompChoice is "+ CompChoice);
        }
        else if(UserChoice == 2 && CompChoice == 1 || UserChoice == 3 && CompChoice == 2 || UserChoice == 1 && CompChoice == 3 ){
            System.out.println("Congratulation! You win.....");
            System.out.println("CompChoice is "+ CompChoice);
        }
        else{
            System.out.println("You lose...");
            System.out.println("CompChoice is "+ CompChoice);
        }
    }
}


public class Rock_paper_scissors {
    public static void main(String[] args) {

        Game1 g = new Game1();
        g.GetUserInput();
        g.GetResult();

    }
}
