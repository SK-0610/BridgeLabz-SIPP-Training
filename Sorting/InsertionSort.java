public class InsertionSort {

    public static void insertionSort(int[] idx) {
        for (int i = 1; i < idx.length; i++) {
            int key = idx[i];
            int j = i - 1;
            while (j >= 0 && idx[j] > key) {
                idx[j + 1] = idx[j];
                j--;
            }
            idx[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {104, 101, 109, 103, 102, 108};
        insertionSort(employeeIDs);

        System.out.println("Sorted Employee IDs (Ascending):");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }
}
