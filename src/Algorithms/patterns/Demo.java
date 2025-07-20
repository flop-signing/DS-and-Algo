package Algorithms.patterns;

// ** Trics

// 1. Run the outer for loop numbers of lines=number of rows==number of times the outer loop will run
// 2. Identify for every row number how many columns are there or types of elements in the column
// 3. What will be printed

public class Demo {


    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }


}
