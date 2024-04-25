import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<Integer> shelf = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int operationType = scanner.nextInt();

            switch (operationType) {
                case 1:
                    int diskLeft = scanner.nextInt();
                    shelf.add(0, diskLeft); // Добавляем в начало списка
                    break;
                case 2:
                    int diskRight = scanner.nextInt();
                    shelf.add(diskRight); // Добавляем в конец списка
                    break;
                case 3:
                    if (!shelf.isEmpty()) {
                        System.out.println(shelf.remove(0)); // Удаляем первый элемент
                    } else {
                        System.out.println("Shelf is empty");
                    }
                    break;
                case 4:
                    if (!shelf.isEmpty()) {
                        System.out.println(shelf.remove(shelf.size() - 1)); // Удаляем последний элемент
                    } else {
                        System.out.println("Shelf is empty");
                    }
                    break;
                default:
                    break;
            }
        }

        scanner.close();
    }
}
