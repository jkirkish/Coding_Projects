package Stacks;

import java.util.Stack;

public class StringReverser {

    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        System.out.println("Pushed: " + stack);
        
        StringBuffer reversed = new StringBuffer();
        while (!stack.empty()) {
            reversed.append(stack.pop());
        }
        
        return reversed.toString();
    }
    public String reverse1(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        System.out.println("Pushed: " + stack);
        
        String reversed = "";
        while (!stack.empty()) {
            System.out.println(reversed += stack.pop());
        }
        
        return reversed;
    }
}
