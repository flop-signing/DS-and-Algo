
public class Main {
    public static void main(String[] args) {
//        int[] array = {9, 8, 5, 4, 1, 4, 3, 0, 8, 9};
        int decimal = 10;
        String binary = "";

        int temp = decimal;
        while (temp > 0) {
            binary = (temp % 2) + binary;
            temp /= 2;
        }
        System.out.println("Binary: " + binary); // Output: 1010
    }
}
