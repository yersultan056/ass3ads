import java.util.*;

public class task5 {
    public static int countStudents(int[] students, int[] samsas) {
        Stack<Integer> stack = new Stack<>();
        for (int samsa : samsas) {
            stack.push(samsa);
        }
        int count = 0;
        for (int student : students) {
            if (!stack.isEmpty() && stack.peek() == student) {
                stack.pop();
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] students = new int[n];
        int[] samsas = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            samsas[i] = scanner.nextInt();
        }
        int unableToEat = countStudents(students, samsas);
        System.out.println(unableToEat);
    }
}
