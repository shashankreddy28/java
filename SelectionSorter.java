public class SelectionSorter{
    public static void main(String[] args){
        int[] arr = {5,9,8,1,3,4,2,5};
        int[] arr2 = {10,100,1,500,1000,3,2,6,4,40,55,90};
        Sort(arr);
        CIS122.printArr(arr);
        Sort(arr2);
        CIS122.printArr(arr2);
    }
    
    public static void Sort(int[] arr){
     for(int i = 0; i<arr.length-1;i++){
        int minPos = findMinPos(arr,i);
        int temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
     }   
    }
    public static int findMinPos(int[] arr, int start){
        int result =start;
        int minElement = arr[start];
        for(int i = start+1;i<arr.length;i++){
            if(arr[i]<minElement){
                result = i;
                minElement = arr[i];
            }
        }


        return result;
    }
}