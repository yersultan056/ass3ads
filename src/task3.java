import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Deque<Integer> shelf = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int operationType = scanner.nextInt();
            if (operationType == 1) {
                int diskNumber = scanner.nextInt();
                shelf.addFirst(diskNumber - 1); //left
            } else if (operationType == 2) {
                int diskNumber = scanner.nextInt();
                shelf.addLast(diskNumber - 1); //right
            } else if (operationType == 3) {
                int removedDisk = shelf.pollFirst(); //remove from left
                System.out.println("3 " + removedDisk);
            } else if (operationType == 4) {
                int removedDisk = shelf.pollLast(); //remove from right
                System.out.println("4 " + removedDisk);
            }
        }
    }
}
