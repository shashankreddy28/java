//  import java.util.Scanner;

public class CIS122 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        double c= 4.951;
        double bottle =1.949;
        System.out.println(c+bottle);//doesnt give expected answer due to roundoff error
        double vdouble =10;// automatically creates it into 10.0
        int vint =10;
        System.out.println(Math.pow(10, 3)); //looks like it always has decimal point with pow fnc
        System.out.println(Math.pow(vdouble,3));
        System.out.println(Math.pow(vint, 3));
        System.out.println(Math.abs(3-10));//no decimal place
        System.out.println(vdouble/vint);// give a double output
        System.out.println("Hey\nhello");
        System.out.printf("Hey%nhello\n");
        int new_int = -14510;
        System.out.println(new_int%100); //generally used to get the last 2 digits, but if the result is 0 then the last 2 digits are 00. when the number >= 0 otherwise, it will give negative of the last 2 digits so, to use it we will have to use abdsolte value of it
        double variable = 185.92 ;
        long roundedVariable = Math.round(variable);//round always returns long value if we want to use it as int, we will have to convert it.
        int roundeedInt = (int) roundedVariable;//converting the round to int type
        System.out.println(roundedVariable +"   " +roundeedInt);
        int CIS122 = 40;
        System.out.println(CIS122);

        //avoiding round off errors:
        double r = Math.sqrt(2);
        double delta = (r*r) - 2;
        double EPSILON = 1E-14;
        if (delta <= EPSILON ){
            System.out.println("sqrt(2) squared minus 2 is 0");
        }
        else {
            System.out.println("sqrt(2) squared minus 2 is " + delta);
        }
    }
}


/*make sure to always divide by a float to get exact result, the int division is not too good. 
 * the modulus func (%) gives a negative value when a negative value is there in the denominator or numerator, to avoid error
 * USE Math.floorMod(a,b) as long as b is positive, it will not give negative value
 * 
 * 
*/

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