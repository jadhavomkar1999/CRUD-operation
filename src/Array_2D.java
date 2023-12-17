
// Row wise sum

/*
import java.util.HashMap;
import java.util.Scanner;

public class Array_2D {

    static void Row_wise_sum(int arr[][],int row,int col){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<row;i++){
            int sum = 0;
            for(int j=0;j<col;j++){

                if(j == col-1){
                    sum = sum+arr[i][j];

                    map.put(i,sum);
                }
                else{
                    sum = sum+arr[i][j];
                }
            }
        }

        System.out.println(map);

        int largestsum = 0;
        int row_no = 0;

        for(int i=0;i<row;i++){

            int d = map.get(i);


            //largestsum = Math.max(largestsum,d);
            if(largestsum < d){
                largestsum = d;
                row_no = i+1;
            }
        }
        System.out.println("Largest sum: "+largestsum +" of Row: "+row_no);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows: ");
        int row = sc.nextInt();

        System.out.println("Enter the columns: ");
        int col = sc.nextInt();

        int[][]arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter the number: ");
                int val = sc.nextInt();
                arr[i][j] = val;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        Row_wise_sum(arr,row,col);
    }
}
*/

// Middle of the matrix


import java.util.Scanner;
import java.util.Vector;

/*
public class Array_2D {

    static void MiddleOfMatrix(int arr[][],int row,int col){

        if(row%2 != 0 && col%2 != 0){
            int r = (row/2);
            int c = (col / 2);

            System.out.println(r + " " + c);
            System.out.println("Middle of matrix is: "+arr[r][c]);
        }
        else{
            System.out.println("There is multiple middle element in matrix due to even row or coumn.");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows: ");
        int row = sc.nextInt();

        System.out.println("Enter the columns: ");
        int col = sc.nextInt();

        int[][]arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter the number: ");
                int val = sc.nextInt();
                arr[i][j] = val;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        MiddleOfMatrix(arr,row,col);
    }
}

 */

// Wave print the 2d matrix

/*
public class Array_2D {

    static void Wave_Traverse(int arr[][],int row,int col){

        for(int i=0;i<col;i++){
            if(i % 2 ==0){
                for(int j=0;j<row;j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for(int j=row-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
            }

        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows: ");
        int row = sc.nextInt();

        System.out.println("Enter the columns: ");
        int col = sc.nextInt();

        int[][]arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter the number: ");
                int val = sc.nextInt();
                arr[i][j] = val;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        Wave_Traverse(arr,row,col);

    }

}
 */

// Spiral Print

public class Array_2D {

    static void Spiral_Print(int arr[][],int row, int col){

        int total = row*col;
        Vector<Integer> vt = new Vector<Integer>();

        int startrow = 0;
        int endrow = row-1;
        int startcol = 0;
        int endcol = col-1;
        int cnt = 0;

        while(cnt<total){

            // starting row
            for(int i=startcol;cnt<total && i<=endcol;i++){
                vt.add(arr[startrow][i]);
                System.out.print(arr[startrow][i]+" ");
                cnt++;
            }
            startrow++;

            //ending column
            for(int i = startrow;cnt<total && i<=endrow;i++){
                vt.add(arr[i][endcol]);
                System.out.print(arr[i][endcol]+" ");
                cnt++;
            }
            endcol--;

            //ending row
            for(int i=endcol; cnt<total && i>=startcol;i--){
                vt.add(arr[endrow][i]);
                System.out.print(arr[endrow][i]+" ");
                cnt++;
            }
            endrow--;

            //starting column

            for(int i=endrow; cnt<total && i>=startrow;i--){
                vt.add(arr[i][startcol]);
                System.out.print(arr[i][startcol]+" ");
                cnt++;
            }
            startcol++;
        }

        System.out.println(vt);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows: ");
        int row = sc.nextInt();

        System.out.println("Enter the columns: ");
        int col = sc.nextInt();

        int[][]arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter the number: ");
                int val = sc.nextInt();
                arr[i][j] = val;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        Spiral_Print(arr,row,col);

    }
}