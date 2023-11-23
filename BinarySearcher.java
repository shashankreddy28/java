public class BinarySearcher{
    public static void main(String[] args){
        int[] arr = {5,9,8,1,3,4,2,5,0};
        int[] arr2 = {10,100,1,500,1000,3,2,6,4,40,55,90};
        QuickSorter.Sort(arr);
        CIS122.printArr(arr);
        QuickSorter.Sort(arr2);
        CIS122.printArr(arr2);
        int value = 7;
        System.out.println("Binary Search in array 1 of int "+value +" returned " + BinarySearch(arr, value));
        System.out.println("Binary Search in array 2 of int "+value +" returned " + BinarySearch(arr2, value));

    }
    public static int BinarySearch(int[] sortedArr, int value){
        return BinarySearch(sortedArr, 0, sortedArr.length-1, value);
    }
    public static int BinarySearch(int[] sortedArr, int start, int end, int value){
        int result = -1;
        if(start<=end){
            int mid = (start+end)/2;
            if(sortedArr[mid] == value){return mid;}
            else if(sortedArr[mid] < value){return BinarySearch(sortedArr, mid+1, end, value);}
            else{return BinarySearch(sortedArr, start, mid-1, value);}
        }
        return result;
    }
}