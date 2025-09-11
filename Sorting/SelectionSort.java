
public class SelectionSort{
    public static void selectionSort(int[] scores){
        int n = scores.length;
        
        for(int i = 0; i < n-1;i++){
            int minIdx = i;
            
        for(int j = i+1;j<n;j++){
            if(scores[j] < scores[minIdx]){
                minIdx = j;
            }
        }
        int temp = scores[i];
        scores[i] = scores[minIdx];
        scores[minIdx] = temp;
        }
        
    }
	public static void main(String[] args) {
        int[] examScores = {85, 92, 78, 90, 88};
        selectionSort(examScores);

        System.out.println("After Sorting:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}
