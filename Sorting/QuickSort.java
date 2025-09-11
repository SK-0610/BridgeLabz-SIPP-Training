public class QuickSort{
    public static void quickSort(int[] arr, int low , int high){
        if(low < high){
           int pivotElement = partition(arr,low,high);
           
           quickSort(arr , low, pivotElement - 1);
           quickSort(arr,pivotElement+1,high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        
        for(int j = low; j < high;j++){
            if(arr[j] < pivot){
              i++;  
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
        }
    }
           int temp = arr[i + 1];
           arr[i + 1]= arr[high];
           arr[high] = temp;
           
           return i + 1;
    }
	 public static void main(String[] args) {
        int[] prices = {500, 100, 1500, 300, 700};
        quickSort(prices, 0, prices.length - 1);

        System.out.println("After sorting:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}