//package coursera;

import java.util.Scanner;
import java.util.Stack;

class Bracket {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = true;
        int i=0;
        for ( i = 0; i < str.length(); i++) {
            char next = str.charAt(i);
            if (next == '(' || next == '[' || next == '{') {
                st.push(next);
            } else if (next == ')' || next == ']' || next == '}') {
                if (st.empty() == true) {
                    i++;
                    flag = false;
                    break;
                } else {
                    char c = st.peek();
                    if (c == '[' && next == ']')
                        st.pop();
                    else if (c == '{' && next == '}')
                        st.pop();
                    else if (c == '(' && next == ')')
                        st.pop();
                    else {
                        flag = false;
                        i++;
//                        System.out.println(i+1);
                        break;
                    }
                }

            }

        }
        if(flag && st.empty())
            System.out.println("Success");
        else
            System.out.println(i);


    }
}





