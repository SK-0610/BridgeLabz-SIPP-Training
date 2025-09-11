public class HeapSort 
{
    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 1, 3, 2};
        HeapSort hs = new HeapSort();
        hs.sort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    void sort(int[] arr) {
        int length = arr.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(arr, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int n, int l) {
        int largest = l;
        int li = 2 * l + 1;
        int ri = 2 * l + 2;

        if (li < n && arr[li] > arr[largest]) {
            largest = li;
        }

        if (ri < n && arr[ri] > arr[largest]) {
            largest = ri;
        }

        if (largest != l) {
            int temp = arr[l];
            arr[l] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}

