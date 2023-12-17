import java.util.Scanner;

public class No_Of_Century {
    static void find_century(int year) {

        // No negative value is allow for year
        if (year <= 0)
            System.out.print("0 and negative is not allow"
                    + "for a year");

            // If year is between 1 to 100 it
            // will come in 1st century
        else if (year <= 100)
            System.out.print("1st century\n");

        else if (year % 100 == 0)
            System.out.print(year / 100 + " century");

        else
            System.out.print(year / 100 + 1 + " century");
    }

    // Driver code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year in yyyy format: ");
        int year = sc.nextInt();
        find_century(year);
    }
}
