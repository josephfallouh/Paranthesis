import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        Stack<Character> pareStack = new Stack<>();
        char currentBrace;
        boolean verdict = true; 
        String parenthesis = StdIn.readLine();

        for( int i = 0; i < parenthesis.length(); i++ ) {
            if(parenthesis.charAt(i) == '(' || parenthesis.charAt(i) == '{' || parenthesis.charAt(i) == '[') {
                pareStack.push(parenthesis.charAt(i));
            }
            else if(parenthesis.charAt(i) == ')' || parenthesis.charAt(i) == '}' || parenthesis.charAt(i) == ']') {
                if(pareStack.isEmpty()) {
                    verdict = false;
                }
                currentBrace = pareStack.pop();
                if((parenthesis.charAt(i) == ')' && currentBrace != '(') || (parenthesis.charAt(i) == '}' && currentBrace != '{') || (parenthesis.charAt(i) == ']' && currentBrace != '[')) {
                    verdict = false;
                }
            }

        }

        StdOut.println(verdict);
    }
}