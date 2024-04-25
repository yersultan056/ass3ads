public class task6 {
    public static void heapify(int[] array, int size, boolean isMaxHeap) {
        int startIdx = (size / 2) - 1;

        if (isMaxHeap) {
            for (int i = startIdx; i >= 0; i--) {
                maxHeapify(array, size, i);
            }
        } else {
            for (int i = startIdx; i >= 0; i--) {
                minHeapify(array, size, i);
            }
        }
    }

    private static void maxHeapify(int[] array, int size, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && array[left] > array[largest]) {
            largest = left;
        }

        if (right < size && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != index) {
            swap(array, index, largest);
            maxHeapify(array, size, largest);
        }
    }

    private static void minHeapify(int[] array, int size, int index) {
        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && array[left] < array[smallest]) {
            smallest = left;
        }

        if (right < size && array[right] < array[smallest]) {
            smallest = right;
        }

        if (smallest != index) {
            swap(array, index, smallest);
            minHeapify(array, size, smallest);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4, 10, 3, 5, 1};
        boolean isMaxHeap = true;
        int size = array.length;

        heapify(array, size, isMaxHeap);
        printArray(array);
    }
}