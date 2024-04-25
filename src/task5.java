import java.util.Scanner;
import java.util.Stack;

public class task5 {
    public static int countStudentsUnableToEat(int[] students, int[] samsas) {
        Stack<Integer> samsasStack = new Stack<>();

        for (int i = samsas.length - 1; i >= 0; i--) {
            samsasStack.push(samsas[i]);
        }

        int unableToEatCount = 0;

        for (int student : students) {
            if (!samsasStack.isEmpty() && samsasStack.peek() == student) {
                samsasStack.pop();
            } else {
                unableToEatCount++;
            }
        }

        return unableToEatCount;
    }
    public static void main(String[] args) {
        int[] students = {1, 1, 0, 0};
        int[] samsas = {0, 1, 0, 1};
        int unableToEat = countStudentsUnableToEat(students, samsas);
        System.out.println(unableToEat);
    }


}
