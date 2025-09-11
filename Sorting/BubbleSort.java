public class BubbleSort {

    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {78, 45, 89, 32, 67, 90, 56};
        bubbleSort(studentMarks);

        System.out.println("Sorted Marks(Ascending):");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}
