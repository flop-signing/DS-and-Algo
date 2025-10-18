package Algorithms.stack;



import java.util.Stack;

public class PostfixToPrefix {

    public static void main(String[] args) {
        String postfix = "ABC*+D-"; // (A+(B*C))-D
        System.out.println("Postfix: " + postfix);
        System.out.println("Prefix:  " + postfixToPrefix(postfix));
    }

    static String postfixToPrefix(String postfix) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                String op2 = st.pop();
                String op1 = st.pop();
                String exp = ch + op1 + op2; // operator before operands
                st.push(exp);
            }
        }

        return st.peek();
    }
}
