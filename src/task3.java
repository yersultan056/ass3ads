import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Deque<Integer> shelf = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int operationType = scanner.nextInt();
            if (operationType == 1) {
                int diskNumber = scanner.nextInt();
                shelf.addFirst(diskNumber - 1);
            } else if (operationType == 2) {
                int diskNumber = scanner.nextInt();
                shelf.addLast(diskNumber - 1);
            } else if (operationType == 3) {
                int removedDisk = shelf.pollFirst();
                System.out.println("3 " + removedDisk);
            } else if (operationType == 4) {
                int removedDisk = shelf.pollLast();
                System.out.println("4 " + removedDisk);
            }
        }
    }
}

