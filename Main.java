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

public class Main {
  // public void myFunction(int param1, double param2) {
  //     System.out.println("This is the first function with int and double parameters: " + param1 + ", " + param2);
  // }

  public void myFunction(double param1, int param2) {
      System.out.println("This is the second function with double and int parameters: " + param1 + ", " + param2);
  }

  public static void main(String[] args) {
      Main myClass = new Main();

      // Calls the first function with int and double parameters
      myClass.myFunction(10, 20);
  }
}
