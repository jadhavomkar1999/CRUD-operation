import java.util.Scanner;
public class j_08_ArrayJava {
    public static void main(String[] args){
        // Creat the array
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] marks = new int[n];
        /*marks [0]=100;
        marks [1] = 98;
        marks [2] = 86;
        marks [3] = 77;
        marks [4] = 67;*/

        for(int i=0;i<5;i++){

            System.out.println("Enter the array element: ");

            int s = sc.nextInt();
            marks[i] = s;

        }

        System.out.println("Length of an array: "+ marks.length);

        /*for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }*/

        // For each loop use for display array

        for( int ste : marks){
            System.out.println(ste);
        }
    }
}
