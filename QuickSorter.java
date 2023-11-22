public class QuickSorter{
    public static void main(String[] args){
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
    public static void Sort(int[] arr,int from, int to){
        if(to<=from){return;}
        int pivot = Partition(arr, from, to); //should return index of value at right  place
        Sort(arr, from, pivot-1);
        Sort(arr, pivot+1, to);

    }
    public static int Partition(int[] arr,int from, int to){
        int pivot = arr[to];
        
        int i = from -1;
        int j = from;
        while(j<=to){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        return i;
    }


}
