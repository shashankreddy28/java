 import java.util.Scanner;

public class CIS122 {
    public static void main(String[] args) {

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
        // int CIS122 = 40;//file name can be used as a variable
        // System.out.println(CIS122);



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
        // int aSquare = a*a;
        // int bSquare = b*b;
        // int cSquare = c*c;
        // double aSquare = Math.pow((double)(a),(double)(2));
        // double bSquare = Math.pow((double)(b),(double)(2));
        // double cSquare = Math.pow((double)(c),(double)(2));
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
            // for (int j= 0;j<6;j++){
            //     for(int g = 7; g>j;g--){
            //         System.out.print("*");
            //     }
            //     System.out.println("");
            // }




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


// char concatination and how it works, its not straight
        char ch = 'a' + 'b'; // this looks for the ascii value of a and b and add them and return the char of that value
        char ch1 = 'a' +1; // this gives the next char.
        System.out.println(ch);
        System.out.println(ch1);





    }
}





// important info about Math.random function and shortcut:-
// for (int)(Math.random() * (number of integers it expects))+(starting value of the range)
// for intnum>=1 and intnum<10: we see that there could be 9 possible nums and starts at 1.
// so it would be (int)(Math.random()*9)+1;


/*make sure to always divide by a float to get exact result, the int division is not too good. 
the modulus func (%) gives a negative value when a negative value is there in the denominator or numerator, to avoid error
USE Math.floorMod(a,b) as long as b is positive, it will not give negative value*/


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

//ch = 'a' + 'b'; will return a char

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