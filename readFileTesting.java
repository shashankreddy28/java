import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;




public class readFileTesting {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("text.txt");
        Scanner in = new Scanner(f);
        in.useDelimiter("[^A-Za-z]+");//just says that anything other than letters should be used as delimiters
        while(in.hasNextLine()){System.out.println(in.nextLine());}


        PrintWriter output = new PrintWriter(f);
        output.print("new ");
        output.print(" text ");
        output.println(" from java.");


        in.close();
        output.close();

    }


}




