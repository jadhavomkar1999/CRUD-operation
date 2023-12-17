//package com.company;
import java.util.Scanner;

public class j_04_UserInput {
    public static void main(String[] args){
        // System.out.println("Taking input: ");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Number 1 : ");
        // int a = sc.nextInt();              // taking number as input

        // System.out.println("Number 2: ");
        // int b = sc.nextInt();

        // int sum = a + b;
        // System.out.println("The sum of these Number is: ");
        // System.out.println(sum);

        // System.out.println("Take new Float Number:");
        // System.out.println("Take Number 3: ");
        // float x = sc.nextFloat();                  // taking float as input

        // System.out.println("Take Number 4: ");
        // float y = sc.nextFloat();

        // float z = x + y;

        // System.out.println("The sum of given Float Number is: ");
        // System.out.println(z);

        // System.out.println("taking string as input: ");

        //String str1 = sc.next();      // taking only one word as input
        //System.out.println(str1);

        String str2 = sc.nextLine();    // taking line as input
        System.out.println(str2);

    }
}
