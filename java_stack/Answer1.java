import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) 
        {
            String line = scanner.nextLine();
            System.out.println(returnfunction(line));
        }
        scanner.close();
    }
    
    public static boolean returnfunction(String input)
    {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) 
        {
            if (isopenbracket(ch)) 
            {
                stack.push(ch);
            } else if (isclosebracket(ch) && !stack.isEmpty() && ismatching(stack.pop(), ch)) 
            {
                continue;
            } 
            else 
            {
                return false;
            }
        }
        
        return stack.isEmpty();
        
    }

    public static boolean isopenbracket(char ch) 
    {
        return ch == '{' || ch == '(' || ch == '[';
    }

    public static boolean isclosebracket(char ch) {
        return ch == '}' || ch == ')' || ch == ']';
    }

    public static boolean ismatching(char ch1, char ch2) {
        return (ch1 == '{' && ch2 == '}') || (ch1 == '[' && ch2 == ']') || (ch1 == '(' && ch2 == ')');
    }
}
