import java.util.Scanner;
public class j_06_conditionalSwitch {
    public static void main(String[] args){

        System.out.println("Please enter your age: ");
        Scanner sc = new Scanner(System.in);

        int age  = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 68:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy  your life!");
        }
    }
}
