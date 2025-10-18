package Algorithms.stack;
import java.util.Stack;
public class PostfixToInfix {

    public static void main(String[] args) {
        String postfix = "ABC*+D-"; // (A + (B * C)) - D
        System.out.println("Postfix: " + postfix);
        System.out.println("Infix:   " + postfixToInfix(postfix));
    }

    static String postfixToInfix(String postfix) {
       Stack<String> st=new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            // Operand → push
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }
            // Operator → pop 2 operands
            else {
                String op2 = st.pop();
                String op1 = st.pop();
                String exp = "(" + op1 + ch + op2 + ")";
                st.push(exp);
            }
        }

        return st.peek(); // final infix expression
    }
}