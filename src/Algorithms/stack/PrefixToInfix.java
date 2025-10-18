package Algorithms.stack;



import java.util.Stack;

public class PrefixToInfix {

    public static void main(String[] args) {
        String prefix = "-+A*BCD"; // (A+(B*C))-D
        System.out.println("Prefix: " + prefix);
        System.out.println("Infix:  " + prefixToInfix(prefix));
    }

    static String prefixToInfix(String prefix) {
        Stack<String> st = new Stack<>();

        // traverse right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                String op1 = st.pop();
                String op2 = st.pop();
                String exp = "(" + op1 + ch + op2 + ")";
                st.push(exp);
            }
        }

        return st.peek();
    }
}
