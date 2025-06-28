package Algorithms.string;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');// calculate the sum of the ascii values of this two character
        System.out.println("A"+"b"); // Ab
        System.out.println('a'+3); //100
        System.out.println((char)('a'+3));  // d

        System.out.println("a"+1);   // a1
        // Here the integer will be converted to Integer and the wrapper class integer have method .toString() that is called the wrapper class;

        //
        System.out.println("Mehedi"+new ArrayList<>());  // Mehedi[]f



    }
}
