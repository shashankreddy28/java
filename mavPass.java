import java.util.Arrays;

public class mavPass {
    public static void main(String[] args){
        System.out.println("hello World");
        int[][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
                        int[][] arr2 = {{1,1,1},
                        {1,1,1},
                        {1,1,1}};
        print2DArr(arr);
        System.out.println();
        swap(arr);
        print2DArr(arr);
        System.out.println(identicalTest(arr2)); //true
        System.out.println(identicalTest(arr));  //false  
        System.out.println(summ(2)); 
        System.out.println(powerN(5,3));
    }
    public static void print2DArr(int[][] arr){
        for(int i=0;i<arr.length;i++){for(int j = 0; j < arr[i].length;j++){System.out.print(arr[i][j]+" , ");}System.out.println();}

    }
    public static void swap(int[][] arr){ // swaps first and secod row in a 2d array
        int[] newArr;
        newArr = Arrays.copyOf(arr[0],arr[0].length);
        arr[0] = arr[1];
        arr[1] = newArr;
    }
    public static boolean identicalTest(int[][] arr){//checks if the array has all same elements.
        int first = arr[0][0];
        for(int i =0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(arr[i][j]!=first){return false;}
            }
        }
        return true;
    }
    public static int summ(int x){
        if(x<=1){return 1;}
        return x+summ(x-1);
    }
    public static int powerN(int base,int exponent){
        if(exponent<=0){return 1;}
        else{
            return base * powerN(base, exponent-1);
        }
    }
    public static int fact(int num){
        if(num<=1){return 1;}
        else{return num* fact(num-1);}
    }
}
