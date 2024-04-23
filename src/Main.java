import java.util.*;

public class Main {
    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(scanner.nextInt());
        }

        reverseStack(stack);

        System.out.println(stack);
    }
}