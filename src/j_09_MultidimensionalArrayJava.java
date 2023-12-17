import java.util.Scanner;
public class j_09_MultidimensionalArrayJava {
    public static void main(String[] args){

        // Creating the 2D array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] flat = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j = 0 ;j<m;j++){
                int st = sc.nextInt();

                flat[i][j] = st;
            }
        }

        int size = flat.length;
        System.out.println("Size of an 2D array: " + size);

        for(int i=0;i< flat.length;i++){
            for(int j = 0 ;j<flat[i].length;j++){
                int st = sc.nextInt();

                System.out.print(flat[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
