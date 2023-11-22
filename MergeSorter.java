public class MergeSorter{
    public static void main(String[] args){
        //test array
        int[] arr = {5,9,8,1,3,4,2,5};
        int[] arr2 = {10,100,1,500,1000,3,2,6,4,40,55,90};
        Sort(arr);
        printArr(arr);
        Sort(arr2);
        //printing all elements
        printArr(arr2);
        
        
    }
    public static void printArr(int[] arr){
        for (int element: arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public static void Sort(int[] arr){
        Sort(arr,0,arr.length-1);
    }
    public static void Sort(int[] arr, int from, int end){
        if(from>=end){return;}//base case
        int mid = (end + from)/2;
        Sort(arr, from, mid);
        Sort(arr,mid+1,end);
        merge(arr,from, mid,mid+1, end);
    } 
    public static void merge(int[] arr, int from1, int end1, int from2 ,int end2){
        int[] result = new int[arr.length]; // new array created just to hold sorted elements(temporary)
        // result is jut temporary location for sorted array.
        int resultIndex = from1;//change made
        int firstIndex = from1;
        int secondIndex = from2;
        while(firstIndex<=end1 && secondIndex<=end2){
            if(arr[firstIndex]<arr[secondIndex]){
                result[resultIndex] = arr[firstIndex];
                firstIndex++;
            }
            else{
                result[resultIndex] = arr[secondIndex];
                secondIndex++;
            }
            resultIndex++;
        }
        while(firstIndex<=end1){
            result[resultIndex] = arr[firstIndex];
                firstIndex++;
                resultIndex++;
        }
        while(secondIndex<=end2){
            result[resultIndex] = arr[secondIndex];
            secondIndex++;  
            resultIndex++;      
        }
        // Update the original array with the sorted values
        for (int i = from1; i <= end2; i++) {
            arr[i] = result[i];
        }
    }
}