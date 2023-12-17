
//Maximum sum of continueos array by using kadance algorithm.

import java.util.Scanner;

public class kadance_algorithm {

    static int MaxSumSubarray(int arr[] , int n){
        
        int maxso_for = 0;
        int max_end = 0;
        int start = 0;
        int end = 0;
        int s = 0;

        for(int i=0;i<n;i++){
            maxso_for += arr[i];

            if(max_end < maxso_for){
                max_end = maxso_for;
                start = s;
                end = i ;


            } else if (maxso_for < 0) {
                maxso_for = 0;
                s= i+1;
            }
        }
        System.out.println(s+" "+end);
        return max_end;


    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            arr[i] = a;
        }

        System.out.println(MaxSumSubarray(arr,n));


    }
}
