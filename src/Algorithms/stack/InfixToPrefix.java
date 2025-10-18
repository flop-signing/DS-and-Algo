package Algorithms.stack;

// The Steps are

// 1. Reverse the given Infix
// 2. Infix to Postfix conversion -->> making the closing bracket to an opening and vice versa
// i)  without the more priority like ^ if priority is same then just insert it into the stack.
// 3. Reverse the answer of postfix



/*

       Infix to Postfix

       priority
       1. ^
       2. * and '/'
       3. + and -


       F+D-C*(B+A)

         i=0                                        st                                            ans

         F                                                                                         F
         +                                          +                                              F
         D                                          +                                              FD
         -                                          +-                                             FD
         C                                          +-                                             FDC
         *                                          +-*                                            FDC
         (                                          +-*(                                           FDC
         B                                          +-*(                                           FDCB
         +                                          +-*(+                                          FDCB
         A                                          +-*(+                                          FDCBA                                                                                     abcd^e
         )                                          +-*                                            FDCBA+*-+


 // Reverse the ans  +-*+ABCDF


 */


import java.util.Stack;

public class InfixToPrefix {

    public static void main(String[] args) {
        String expr = "F+D-C*(B+A)";
        System.out.println("Infix:   " + expr);
        System.out.println("Prefix:  " + infixToPrefix(expr));
    }

    static String infixToPrefix(String infix) {
        // Step 1: Reverse the string
        String temp = reverse(infix);

        // Step 2: Swap brackets
        temp = swapBrackets(temp);

        // Step 3: Infix → Postfix on modified string
        int i = 0;
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        while (i < temp.length()) {
            char ch = temp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }
            else if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty()) st.pop();
            }
            else { // operator
                if (ch == '^') { // right-associative
                    while (!st.isEmpty() && priority(ch) < priority(st.peek())) {
                        ans.append(st.pop());
                    }
                } else { // left-associative
                    while (!st.isEmpty() && priority(ch) <= priority(st.peek())) {
                        ans.append(st.pop());
                    }
                }
                st.push(ch);  // FIXED
            }
            i++;
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        // Step 4: Reverse postfix → prefix
        return ans.reverse().toString();
    }

    static int priority(char ch) {
        if (ch == '^') return 3;
        else if (ch == '/' || ch == '*') return 2;
        else if (ch == '+' || ch == '-') return 1;
        else return -1;
    }

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static String swapBrackets(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '(') sb.append(')');
            else if (ch == ')') sb.append('(');
            else sb.append(ch);
        }
        return sb.toString();
    }
}
