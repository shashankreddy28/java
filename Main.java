//*code prints sum of even numbers bw [1,10] including */
// class Main{
//     public static void main (String[] args){
//         int sum = 0;
//         for (int i=0; i<11;i++){
//             if (i%2==0){
//                 System.out.println(i);
//                 sum+=i;
//             }
//             else{
//                 continue;
//             }

//         }
//         System.out.println(sum);
//     }
// }








// //this is code to convert 1 unit to another using only in,cm , m very confusing
// import java.util.Scanner;

// public class Main
// {
//    public static void main(String[] args)
//    {
//       Scanner in = new Scanner(System.in);
//       boolean done = false;
//       double factor1 = 1;
//       double factor2 = 1;
//       String unit1 = "";
//       String unit2 = "";
      
//       while (!done)
//       {
//          boolean getSecond = true;
//          String command = in.next();
//          System.out.println("From unit (in, cm, m, again, quit): " + command);
//          if (command.equals("in"))
//          {
//             factor1 = 2.54; // Convert to cm 
//             unit1 = command;
//          }
//          else if (command.equals("cm"))
//          {
//             factor1 = 1;
//             unit1 = command;/* Your code goes here */
//          }
//          else if (command.equals("m"))
//          {
//             factor1 = 100;
//             unit1 = command;/* Your code goes here */
//          }
//          else if (command.equals("again"))
//          {
//             getSecond = false;
//          }
//          else if (command.equals("quit"))
//          {
//             done = true;
//             getSecond = false;
//          }
//          else
//          {
//             System.out.println("Sorry, unknown unit.\n");
//             getSecond = false;
//          }

//          if (getSecond)
//          {
//             System.out.print("To unit: ");
//             unit2 = in.next();
//             if (unit2.equals("in"))
//             {
//                System.out.println(unit2);//just added
//                factor2 = 2.54; // Convert from cm
//             }
//             else if (unit2.equals("m")){
//                System.out.println(unit2);//just added
//                factor2 = 100;
//                }
//             else if (unit2.equals("cm")){
//                System.out.println(unit2);//just added
//                factor2 = 1;
//                }
//             else{System.out.println(unit2);System.out.println("Sorry, unknown unit. \n");}/* Your code goes here */
//          }
         
//          if (in.hasNextDouble()/* Your code goes here */)
//          {
//             double value = in.nextDouble();
//             double result = value * factor1 / factor2; 
//             System.out.println(value + " " + unit1 + " = " + result + " " + unit2 + "\n");
//          }
//       }
//    }
// }



// class Main {
//     public static void main(String[] args) {
//       System.out.println("Hello world!");
//       String h= "a12345";
//       int a = (int)(h.charAt(0));// does not convert it to integer, rather, returns the ascii value of character.
//       System.out.print(a);
//     }
//   }



// specific instance of overloading, believe java error

// public class Main {
//   public void myFunction(int param1, double param2) {
//       System.out.println("This is the first function with int and double parameters: " + param1 + ", " + param2);
//   }

//   public void myFunction(double param1, int param2) {
//       System.out.println("This is the second function with double and int parameters: " + param1 + ", " + param2);
//   }

//   public static void main(String[] args) {
//       Main myClass = new Main();

//       myClass.myFunction(10.0, 20);
//   }
// }

import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
    // sample question27

    // ArrayList<String> ok = new ArrayList<String>();
    // ok.add("Hu");
    // ok.add("So");
    // ok.add("Su");
    // ok.set(1,"em");
    // ok.add(0,"Sal");
    // ok.remove(1);
    // ok.add("Curry");
    // System.out.println(ok);

    // q18
    // ArrayList<Integer> var = new ArrayList<Integer>();
    // var.add(1);
    // var.add(2);
    // var.add(3);
    // var.remove(1);
    // System.out.println(var);


    // diff q
    // int[] arr = new int[10];
    // arr[0] = 100;
    // arr[1] = 200;
    // arr[2] = 300;
    // arr[3] = 400;
    // arr[4] = 500;
    // arr[5] = 600;
    // int value = 700;
    // int count = 6;
    // int index = 2;
    // for(int i = count; i>index;i--){ // if i starts at count -1 then teh last value is lost
    //   arr[i] = arr[i-1];
    // }
    // arr[index] = value;
    // count++;
    // System.out.println("Expected: 100,200,700,300,400,500,600");
    // for(int i =0 ; i<count;i++){
    //   System.out.printf("%d ",arr[i]);
    // }



    // coding a

    // ArrayList<Integer>  list = new ArrayList<>();
    // list.add(45);
    // list.add(59);
    // list.add(52);
    // list.add(52);
    // list.add(41);
    // list.add(44);
    // list.add(45);
    // list.add(45);
    // System.out.println(list);

    // int result =0;
    // int currMax =0;
    // int MaxOcc =0;
    // for (int i =0;i<list.size();i++){
    //   int element = list.get(i);
    //   int currCount = 0;
    //   for(int x = 0;x<list.size();x++){
    //     if (list.get(x) == element){
    //       currCount++;
    //     }
    //   }
    //   if(currCount>MaxOcc){
    //     MaxOcc = currCount;
    //     currMax = element;
    //   }

    // }
    // result = currMax;
    // System.out.println(result);
    // System.out.println(MaxOcc);



    // coding b
    // double[] arr = {8.6,1.3,7.2,9.6,2.0};
    // double temp = arr[0];
    // for(int i =0; i< arr.length-1;i++){
    //   arr[i] = arr[i+1];
    // }
    // arr[arr.length-1] = temp;
    // for(int i =0 ; i<arr.length;i++){
    //   System.out.printf("%.2f ",arr[i]);
    // }

    

    // Coin penny = new Coin(1,"Penny");
    // Coin nickle = new Coin(10,"nickle");

    // System.out.println("penny");
    // System.out.println(penny.getName());
    // System.out.println(penny.getValue());

    // System.out.println("Nickle");
    // System.out.println(nickle.getName());
    // System.out.println(nickle.getValue());
    // System.out.println("total number:");

    // System.out.println(Coin.getTotalNumber());
    // System.out.println("total value");

    // System.out.println(Coin.getTotalValue());





    // for some challenge question 8.3.3
    // import java.util.ArrayList;

    // public class CountingArrayList extends ArrayList<String>
    // {
    //   /* Your code goes here */
    //   private ArrayList<String> theList;
      
    //   public CountingArrayList(){
    //      super();
    //      theList = new ArrayList<String>();
         
    //      }
       
    //    /**
    //       Gets the counter of get or set operations.
    //       @param what "get" or "set"
    //       @return the number of get or set operations invoked on this array list.
    //    */
    //    public int count(String what) 
    //    {
    //       int counter = 0;
    //       for(String element:theList)
    //       {
    //          if(element.equals(what)){
    //             counter++;
    //          }
    //       }
    //       return counter;
    //    }
    //    public String set(int index, String element){
          
    //       theList.add("set");
    //       return super.set(index,element);
    //       }
    //    public String get(int index, String element){
          
    //       theList.add("get");
    //       return super.get(index);
    //       }
    // }
  }
}