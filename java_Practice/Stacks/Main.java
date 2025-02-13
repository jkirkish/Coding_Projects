package Stacks;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // String str = "abcd";

        // StringReverser reverser = new StringReverser();
        // var result = reverser.reverse1(str);
        // System.out.println(result);
        // Stack stack = new Stack();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.pop();
        // stack.pop();
        // System.out.println(stack);
        String str = "(1 + 2)";

        Expression exp = new Expression();
        var result = exp.isBalanced(str);
        
        System.out.println(result);
    }
}
