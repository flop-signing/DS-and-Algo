package Algorithms.string;

public class Comparison {

    public static void main(String[] args) {
        String a = "Mehedi";
        String b = "Mehedi";
        String c=a;
    //    System.out.println(c);
 //       System.out.println(c==a);// returns true
//        System.out.println(a == b); // returns true cz  the two strings are same.

        // The above two strings are same. Because they are in the same pool.

        String aa = new String("Trent");
        String bb = new String("Trent");

        // As here we have been created two new Object() that's why here it's created two different different object outside the string pool.
        // And that's why it returns a==b false.cz  they are different and outside the pool.
        System.out.println(aa == bb);

        // If only check the value not object also then we have used to .equals() method.
        System.out.println(aa.equals(bb));

        // For print individual character then that something look like this

        System.out.println(aa.charAt(0));


    }
}
