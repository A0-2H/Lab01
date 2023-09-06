public class Sorter {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 4, 2, 8};
        selectionSort(numbers);

        System.out.println("Sorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element in the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
