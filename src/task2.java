import java.util.ArrayList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            String queryType = scanner.next();
            if (queryType.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                L.add(x, y);
            } else if (queryType.equals("Delete")) {
                int x = scanner.nextInt();
                L.remove(x);
            }
        }
        for (int num : L) {
            System.out.print(num + " ");
        }
    }
}
