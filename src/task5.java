import java.util.*;

public class task5 {
    public static int countStudents(int[] students, int[] samsas) {
        Queue<Integer> queue = new LinkedList<>();
        for (int student : students) {
            queue.add(student);
        }
        int count = 0;
        for (int samsa : samsas) {
            int size = queue.size();
            while (!queue.isEmpty() && queue.peek() != samsa) {
                queue.add(queue.remove());
                count++;
                if (count == size) {
                    return queue.size();
                }
            }
            if (!queue.isEmpty()) {
                queue.remove();
            }
            count = 0;
        }
        return queue.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = scanner.nextInt();
        int[] students = new int[n];
        int[] samsas = new int[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            samsas[i] = scanner.nextInt();
        }
        int output = countStudents(students, samsas);
        System.out.println(Arrays.toString(students) + Arrays.toString(samsas));
        System.out.println(output);
    }
}
