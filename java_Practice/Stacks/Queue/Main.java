package Stacks.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        stackExample();
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        //this should be the stack after everything pushed
        System.out.println("Stack is: " + stack);
        // Popping an element from the stack
       
      

        //LIFO
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.err.println(queue);
        //var front = queue.remove();
        // System.out.println(front);
        System.err.println(queue);
        reverse(queue);
        System.err.println(queue);

    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void stackExample() {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping an element from the stack
        System.out.println("Popped: " + stack.pop()); // Removes and prints 30

        // Peeking at the top element
        System.out.println("Top element: " + stack.peek()); // Prints 20

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        // Printing the stack
        System.out.println("Stack contents: " + stack);

    }
}
