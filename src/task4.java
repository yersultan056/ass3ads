import java.util.*;

public class task4 {
    public static void reverseStack(Stack<Integer> stack, int size) {
        Stack<Integer> temp= new Stack<>();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int size = 5;
        for (int i = 0; i < size; i++) {
            stack.push(scanner.nextInt());
        }

        reverseStack(stack, size);

        System.out.println(stack);
    }
}