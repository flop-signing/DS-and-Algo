package Algorithms.stack;
import java.util.Stack;


/*

       Infix to Postfix

       priority
       1. ^
       2. * and '/'
       3. + and -


       a+b*(c^d-e)

         i=0                                        st                                            ans

         a                                                                                         a
         +                                          +                                              a
         b                                          +                                              ab
         *                                          +*                                             ab
         (                                          +*(                                            ab
         c                                          +*(                                            abc
         ^                                          +*(^                                           abc
         d                                          +*(^                                           abcd
         -                                          +*(-                                           abcd^
         e                                          +*(-                                           abcd^e
         )                                          +*                                             abcd^e-
                                                                                                   abcd^e-*+




 */




public class InfixToPostfix {

    public static void main(String[] args) {

    }

    public static String infixToPostfix(String s) {
        int i = 0;
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        while (i < s.length()) {
            char ch = s.charAt(i);

            // Operand → directly add to result
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                ans.append(ch);
            }
            // Opening bracket → push to stack
            else if (ch == '(') {
                st.push(ch);
            }
            // Closing bracket → pop until '('
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty()) st.pop(); // remove '('
            }
            // Operator → pop higher/equal precedence operators
            else {
                while (!st.isEmpty() && priority(ch) <= priority(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
            i++;
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    static int priority(char ch) {
        if (ch == '^') return 3;
        else if (ch == '/' || ch == '*') return 2;
        else if (ch == '+' || ch == '-') return 1;
        else return -1;
    }
}
