public class InsertionSorter{
    public static void main(String[] args){
        int[] arr = {5,9,8,1,3,4,2,5};
        int[] arr2 = {10,100,1,500,1000,3,2,6,4,40,55,90};
        Sort(arr);
        CIS122.printArr(arr);
        Sort(arr2);
        CIS122.printArr(arr2);   
    }
    public static void Sort(int[] arr){
        for(int index = 1; index<arr.length;index++){
            int element = arr[index];
            int j = index;
            while(j>0 && element<arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = element;
        }
    }
}