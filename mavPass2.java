import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;

public class mavPass2 {
    public static void main(String[] args){
        System.out.println();
        Rect rect1 = new Rect(1,1);
        Rect rect2 = new Rect(2,2);
        Rect rect3 = new Rect(3,3);
        ArrayList<Rect> arr = new ArrayList<>();
        arr.add(rect3);
        arr.add(rect2);
        arr.add(rect1);
        for(Rect i : arr){System.out.println(i);}
        Collections.sort(arr);
        System.out.println();
        for(Rect i : arr){System.out.println(i);} 

    }
}

interface Shape{
    public int calcArea();
    public int calcPeri();
}
class Rect implements Shape , Comparable{
        private int length;
        private int breath;
        public Rect(){
            length =0;
            breath =0;
        }
        public Rect(int l, int b){
            length =l;
            breath =b;
        }
        public int calcArea(){
            return length * breath;
        }
        public int calcPeri(){
            return 2*(length+breath);
        }
        public int compareTo(Object obj){
            Rect obj1 = (Rect)(obj);
            return this.calcArea()-obj1.calcArea();
        }
        // public boolean equals(Object rect){
        //     Rect rect1 = (Rect)(rect);
        //     return this.calcArea() == rect1.calcArea();
        // }
        public String toString(){
            return "rect has area : "+calcArea()+" .\n";
        }


}
class Circle implements Shape{
    private int radius;
    // public Circle(){
    //     radius =0;
    // }
    public Circle(int r){
        radius = r;
    }
    public int calcArea(){
        return 3*radius*radius;
    }
    public int calcPeri(){
        return 2*3*radius;
    }


}
