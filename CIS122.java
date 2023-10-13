import java.util.ArrayList;
import java.util.Scanner;

public class CIS122 {
        private static int integer ;
    public static void main(String[] args) {
//showing that variables declared in class have  default values 
        //System.out.println(integer);


///single line test statements:-
        //Scanner in = new Scanner(System.in);
        // System.out.println("Hello World!");
        // double mydouble = 10.1;
        // if(mydouble%10==(0)){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("no");
        // }

        // double c= 4.951;
        // double bottle =1.949;
        // System.out.println(c+bottle);//doesnt give expected answer due to roundoff error
        // double vdouble =10;// automatically creates it into 10.0

        // int vint =10;
        // System.out.println(Math.pow(10, 3)); //looks like it always has decimal point with pow fnc
        // System.out.println(Math.pow(vdouble,3));
        // System.out.println(Math.pow(vint, 3));

        // System.out.println(Math.abs(3-10));//no decimal place

        // System.out.println(vdouble/vint);// give a double output

        // System.out.println("Hey\nhello");
        // System.out.printf("Hey%nhello\n");

        // int new_int = -14510;
        // System.out.println(new_int%100); //generally used to get the last 2 digits, but if the result is 0 then the last 2 digits are 00. when the number >= 0 otherwise, it will give negative of the last 2 digits so, to use it we will have to use abdsolte value of it
        
        // double variable = 185.92 ;
        // long roundedVariable = Math.round(variable);//round always returns long value if we want to use it as int, we will have to convert it.
        // int roundeedInt = (int) roundedVariable;//converting the round to int type
        
        // System.out.println(roundedVariable +"   " +roundeedInt);
        // int CIS122 = 40;//file name/class name can be used as a variable
        // System.out.println(CIS122);



        // static in classes:-
        
        // anything static only exists with the class and never with one of its object

        // a class that is created in the intent to never build a object of the class like MATH class exist and is called something.
        // Math.PI is an example of a public static variable, it is very rare to use a public static variable, it is generally private static cause we dont want others outside to use it.


//using lastIndexOf fnc
        // String str = "this is a long sentence.";
        // int lastPos = str.lastIndexOf(" ");
        // int firstPosI = str.indexOf('i'); // so char can be used as well
        // int firstPosDNE = str.indexOf('A');
        // System.out.printf("%d is the last index of \" \"\n",lastPos);
        // System.out.printf("%d is the first index of 'i'\n",firstPosI);
        // System.out.printf("%d is the first index of 'A'\n",firstPosDNE); //returns -1 when the char doesnt exist in the string




// // avoiding round off errors:
        //     double r = Math.sqrt(2);
        //     double delta = (r*r) - 2;
        //     double EPSILON = 1E-14;
        //     if (delta <= EPSILON ){
        //         System.out.println("sqrt(2) squared minus 2 is 0");
        //     }
        //     else {
        //         System.out.println("sqrt(2) squared minus 2 is " + delta);
        // }
        
       
        

///*calculating volume of cube + volume of sphere */
        // double s = 1;
        // double d = 2;
        // double r = d/2;
        // double sq = Math.pow(s,3);
        // double sp = (4.0/3) * Math.PI * (Math.pow(r,3));

        // System.out.println(sq + sp);
        // int inputnum = in.nextInt();
        // System.out.println(inputnum);

        

////checking for pythogorian triplet:
        // int a = 2;
        // int b = 2;
        // int c = 4;
        // // int aSquare = a*a;
        // // int bSquare = b*b;
        // // int cSquare = c*c;
        // double aSquare = Math.pow(a,2);
        // double bSquare = Math.pow(b,2);
        // double cSquare = Math.pow(c,2);
        // boolean test = (cSquare == (aSquare+bSquare));
        // if (a>=b && a>=c){
        //     test = (aSquare == (cSquare+bSquare));
        // }
        // else if (b>=a && b>=c){
        //     test = (bSquare == (aSquare+cSquare));
        // }
        // System.out.println(test);





////this is for a question where they ask to rearange the following lines of code and it takes input until the inpus is an integer, we need scanner in while loop otherwise it will go into an infinite loop
        // boolean isint = false;
        // System.out.println("enter homeruns:");
        
        // while (isint ==false){
            
        //     Scanner in = new Scanner(System.in);
        //     if(in.hasNextInt()){
        //         int hr = in.nextInt();
        //         System.out.println(hr);
        //         isint = true;

        //     }
        //     else{
        //         System.out.println("Enter integer:");  
                  
        //     }
        // }    




//testing nested for loop that doesnt print full trianlge, be careful.
        //     for (int j= 0;j<6;j++){
        //         for(int g = 7; g>j;g--){
        //             System.out.print("*");
        //         }
        //         System.out.println("");
        //     }




//understanding while loop:-
        // boolean done1 = false;
        // while(!done1){// this following loop will run once completely, just that the condition is checked after the first iteration of the loop is complete, in this case after the for loop is exited and there is nothe other statement in the while loop.
        //     done1=true;
        //     for (int i=1;i<=10;i++){
        //         System.out.print(i);
        //         if(i%2==0){
        //             String justEven = "Even";
        //             System.out.printf(" -> %5s\n",justEven);
        //         }
        //         else{
        //             String justOdd = "Odd";
        //             System.out.printf(" -> %5s\n",justOdd);
                    
        //         }
        //     }   
        // }


//the following code reverses a string: more importantly, we can see that a char can be added to a String
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter a word: ");
        // String s = in.next(); // reverse only 1 word
        // //String s = in.nextLine();// this is to reverse a whole line
        // /* Implement this pseudocode:
        // r = ""        
        // i = 0        
        // while i < length of s
        //     c = ith character of s
        //     r = c + r
        //     i++
        // */
        // String r = "";
        // int i = 0;
        // while (i<s.length()){
        // char c = s.charAt(i);
        // //String c = s.substring(i,i+1); //this also works, remember that there is no capital S.
        // r = c+r;
        // i++;
        // }

        // System.out.println(r);


//// char concatination and how it works, its not straight
        // char ch = 'a' + 'b'; // this looks for the ascii value of a and b and add them and return the char of that value
        // char ch1 = 'a' +1; // this gives the next char.
        // System.out.println(ch);
        // System.out.println(ch1);


// //### Using method1
        // System.out.println("Hello world!");
        // yes("4"); // just 4; would give an error but a function call that returns the smae can just be as itself with no error
        // System.out.println(yes("45"));


////understanding recursive function, calling method 2
        // String word = "some String";
        // System.out.println(everySecond(word));


////ArrayList testing
//// use import java.util.ArrayList; first import before use
        // ArrayList<Integer> arrList = new ArrayList<Integer>();
        // arrList.add(1);
        
        // System.out.println(arrList.get(0)); // .get(x) gets element at the index x.
        // System.out.println(arrList); //we can print whole array list at once which is not teh same in arrays
        // for(int i =1;i<10;i++){
        //         arrList.add(i+1);
        // }

        // arrList.set(0,100); // use .set(index, element) to set element at index to element, so it replaces the value at index 0 to 100.
        // arrList.add(0,100); //add 100 to the 0 index and moves the rest to the rigth so the length of teh list actually grows by 1.
        // arrList.set(arrList.size()-1,100); // the index should already exist so we cant add an element using .set() fnc

        // for (int element:arrList){ // we can use enhanced for loop in array list too
        //         System.out.println(element);
        // }
        // ArrayList<Integer> arrListSameReference = arrList; // this is a pointer that points to teh sam earraylist, so if 1 changes, the other changes too.
        // arrList.add(101);
        // System.out.println(arrListSameReference);
        // ArrayList<Integer> arrListcopy = new ArrayList<Integer>(arrList); // this is a copy of replica for arraylists.It creats a new arraylist with the same values as the initial arraylist
        // arrList.add(102);
        // System.out.println(arrListcopy);
        //System.out.println(arrList.size()); //this is similar to .length of a normal list

        


// 2d array practice activity accessing method3
        // int[][] twoDArray = {{1,2},{3,4,10},{6,7},{-1,50}};
        // int[] sol = findMinMax(twoDArray);
        // for (int element:sol){System.out.println(element);}



//array common algorithms testing
        int[] x = new int[10];
        x[0] = 4;
        x[1] = 2;
        x[2] = 9;
        int currSize = 3;
        int value = 1;
        int pos = 1;
        for(int i = currSize;i>pos;i--){
                x[i] = x[i-1];

        }
        x[pos] = value;
        currSize++;
        for (int element:x){System.out.print(element + " ");}
        System.out.println();
        System.out.println(currSize);

        for(int i=pos;i<currSize-1;i++){
                x[i] = x[i+1];
        }
        currSize--;
        for (int element:x){System.out.print(element + " ");}
        System.out.println();
        System.out.println(currSize);
        

    }//end of main method




//// newMethods 


//// code that shows that you can call a function and not initialize it to anything and it wouldnt be an error
////this is for code mentioned with ###.
        
////method1(just reurns value)
public static String yes(String x) //if the method needs to be used inside the class, then we should use the static modifier
        {
        return x;
        }

////method 2 for recursive function (this prints every second element of a string):

public static String everySecond(String s)
   {
      if (s.length() <= 1)
      {
         return s;
      }
      else
      {
         String simpler = everySecond(s.substring(2));
         return s.charAt(0)+simpler;
      }
   }
 
   
// method3 for the activity provided by mavpass.
public static int[] findMinMax(int[][] input){
        int[] result = new int[2];
        int min = input[0][0];
        int max =input[0][0];
        for(int row=0;row<input.length;row++){
                for(int column = 0;column<input[row].length;column++){
                        if(input[row][column]>max){max = input[row][column];}
                        if(input[row][column]<min){min = input[row][column];}
                }
        }
        result[0]=min;
        result[1] = max;
        return result;
        }   
        
}//end of class





//single line notes: very helpful!

// important info about Math.random function and shortcut:-
// for (int)(Math.random() * (number of integers it expects))+(starting value of the range)
// for intnum>=1 and intnum<10: we see that there could be 9 possible nums and starts at 1.
// so it would be (int)(Math.random()*9)+1;
// like python, x*=2 is the same as x = x*2;



/*make sure to always divide by a float to get exact result, the int division is the same as floor division in python. 
the modulus func (%) gives a negative value when a negative value is there in the denominator or numerator, to avoid error
USE Math.floorMod(a,b) as long as b is positive, it will not give negative value*/

// remember that when you are assigning something to Math.pow(), it will return double type so make sure to assign it to a double type

//use 'javac Main.java && java Main' this code in terminal runs both lines of code
//convention to use 'UPPER_CASE' variable for consatnts.
// System.out.printf("%.2f",price); this is used to round the price to 2 decimal places
// System.out.printf("%10.2f",price); this will use 10 characters in total so if price is 1.224, it will round to 2 decimal places and and leave 6 characters(spaces) "      1.22" 
// we can make it left justify by using negative numbers(System.out.printf(%d))
// from the above example, f stands for floatingpoint but actually means double 
// similarly d stand for digit but actually int.
// %s stands for string  and %n stands for newline(only in printf)
// "\n" generally stands for new line also can be used in printf func
//in boolean operators, && is 'and' and || is 'or'.
// !(a&&b) is equal to !a || !b and vice versa
// ScannerVariable.close();//this line is used to close the scanner object
// Math.round(number); returns a long type rather than an int, so always use (int)(Math.round(number));

// in java the substring function is written in the following form : word.substring(initial value, final value+1 or word.length())

//ch = 'a' + 'b'; will return a char that is the char of the sum of the ascii values of a and b. 

//a method with void as the return type can have a 'return ;' this basically returns nothing, which is fine with void. 


// an array of boolean values will have 'false' as the default values
// an array of String values will have null as the default values




// Ojects and classes

// the constructor method is always the same name as the class itself.
// syntax : public className(){}  notice that there is no return type, that is because this method is used for creating an oject of type the classname so java can do that implicitly

// definition of overloading:-
// in java, we can have multiple methods with the same name, it will not give an error as long as the parameter types are different.
// all classes in java have need to have a constructor mothod, java creates 1 by default for all classes, that is why we can create objects, even when a constructor method was not created


//overloading functions is creating many functions with same name
//overriding is polymorphyism ig

// understanding this(0);
// a contructor can call another constructor by have "this(0);" in the body of the constructor then it calls another constructor with 0 as the parameter.
// using of the this key word and how it works
// Normally, this denotes a reference to the implicit parameter,
// but if this is followed by parentheses, it denotes a call to another constructor of this class. 





// #1
// the following code is to find the position of the last vowel in a string.

// public class CIS122{
//     public static void main(String[] args)
//     {
//         Scanner in = new Scanner(System.in);
//         String word = in.next();
        
//         int position = (word.length()-1);
//         /* Your code goes here */
//         char ch = '?';
//         boolean found = false;
        
        
//         while (!found && position>=0)
//         {
//             /* Your code goes here */
//             ch = word.charAt(position);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//             /* Your code goes here */
//             found = true;
//             }
//             else{
//                 position--;
//             }
//         }
        
//         System.out.println("Position: " + position);
//         in.close();//this line is used to close the scanner object
//     }
// }








// #2
// smart code to reverse a positive number:
// public class CIS122 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         // Printing the digits of n in reverse
      
//         while (n>0  /* Your code goes here */)
//             {
//                 int digit = n%10;
//                 /* Your code goes here */
//                 System.out.print(digit);
//                 /* Your code goes here */
//                 n=n/10;
//             }
            
//         System.out.println();

//     }
// }








//#3
//code to convert a int to binary in reverse order and then reverse it to make it original
// import java.util.Scanner; 

// public class CIS122 { 
//    public static String intToReverseBinary(int integerValue){
//       String r = "";
//       while(integerValue>0){
//          r=r+(integerValue % 2);
//          integerValue=integerValue/2;
//          }
//       return r;
//       }
//    public static String stringReverse(String inputString){
//       String r = "";
//       for (int x=inputString.length()-1;x>=0;x--){
//          r+=inputString.charAt(x);
//          }
//       return r;
      
//       }
   
//    public static void main(String[] args) {
//       /* Type your code here. 
//          Your code must call intToReverseBinary() to get
//          the binary string of an integer in a reverse order.
//          Then call stringReverse() to reverse the string 
//          returned from intToReverseBinary().*/

//          Scanner in = new Scanner(System.in);
//          //int input = in.nextInt();
//          String reverseBinary = intToReverseBinary(in.nextInt()/*input*/);
//          String finalString = stringReverse(reverseBinary);
//          System.out.println(finalString);
         
         
//    }
// }









//#4
//code to flip coin multiple times using random.rand

// import java.util.Scanner;
// import java.util.Random;

// public class CIS122 {
   
//    /* Define your method here */
//    public static String coinFlip(Random rand){
//       int output = (int)(/*Math.random()*2*/rand.nextInt(2));
//       if(output==1){
//          return "Heads";
//       }
//       else{
//          return "Tails";
//       }
//    }
   
//    public static void main(String[] args) {
//       Scanner scnr = new Scanner(System.in);
//       int input = scnr.nextInt();
//       Random rand = new Random(2); // Seed used in develop mode
//       // Add more variables as needed
      
//       for(int i =0;i<input;i++){
//          System.out.println(coinFlip(rand));
//          }
//    }
// }




//#5 
/**Just a template for how to add elements in an array and moving the rest to 1 pos right */
// remember that when we add element at a specific position, we traverse backwards.
// if (currentSize < values.length)
// {
//    currentSize++;
//    for (int i = currentSize - 1; i > pos; i--)
//    {
//       values[i] = values[i - 1];
//    }
//    values[pos] = newElement;
// }




// #6
// ** Just a template of how make a dynamic array, so hte length should automatically increase when we want to add element and the array is full.
// double[] inputs = new double[INITIAL_SIZE];
// int currentSize = 0;
// while (in.hasNextDouble())
// { 
//    // Grow the array if it has been completely filled
//    if (currentSize >= inputs.length)
//    {
//       inputs = Arrays.copyOf(inputs, 2 * inputs.length); // Grow the inputs array
//    }

//    inputs[currentSize] = in.nextDouble();
//    currentSize++;
// }

// #7 
// code template for removing an element from array and moving the rest to the left
// for (int i = pos + 1; i < currentSize; i++)
// { 
//         values[i - 1] = values[i]; 
//      }
//      currentSize--;