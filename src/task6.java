import java.util.*;

public class task6 {

    static void heapify(int arr[], int n, int i, String heapType) {
        int largestOrSmallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (heapType.equals("max")) {
            if (left < n && arr[left] > arr[largestOrSmallest])
                largestOrSmallest = left;
            if (right < n && arr[right] > arr[largestOrSmallest])
                largestOrSmallest = right;
        } else {
            if (left < n && arr[left] < arr[largestOrSmallest])
                largestOrSmallest = left;
            if (right < n && arr[right] < arr[largestOrSmallest])
                largestOrSmallest = right;
        }

        if (largestOrSmallest != i) {
            int swap = arr[i];
            arr[i] = arr[largestOrSmallest];
            arr[largestOrSmallest] = swap;
            heapify(arr, n, largestOrSmallest, heapType);
        }
    }

    static void buildHeap(int arr[], int n, String heapType) {
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i, heapType);
    }

    static void printHeap(int arr[], int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int level = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            System.out.print("Level " + level + ": ");
            for (int i = 0; i < size; i++) {
                int idx = q.poll();
                System.out.print(arr[idx] + " ");
                int left = 2 * idx + 1;
                int right = 2 * idx + 2;
                if (left < n) q.add(left);
                if (right < n) q.add(right);
            }
            System.out.println();
            level++;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter heap type (min or max): ");
        String heapType = scanner.nextLine();
        int arr[] = {4, 10, 3, 5, 1};
        int n = arr.length;

        buildHeap(arr, n, heapType);
        System.out.println("");
        printHeap(arr, n);
    }
}
