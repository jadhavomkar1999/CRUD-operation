import java.util.Scanner;

public class j_02_PracticeJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sub1 marks: ");
        float a = sc.nextFloat();
        System.out.println("enter sub2 marks: ");
        float b =sc.nextFloat();
        System.out.println("enter sub3 marks: ");
        float c = sc.nextFloat();
        System.out.println("enter sub4 marks: ");
        float d =sc.nextFloat();
        System.out.println("enter sub5 marks: ");
        float e =sc.nextFloat();
        float marks = ((a + b + c + d + e)/500)*100;

        System.out.print("Percentage of student is: ");
        System.out.println(marks);
    }
}
