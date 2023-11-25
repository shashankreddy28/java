import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListTest{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("Bro");
        ListIterator<String> iter = list.listIterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
            iter.remove(); // removes the element the iterator just went over
            iter.add("and"); // adds element right before the iterator
        }
        System.out.println();

        System.out.println(list.contains("Bro"));
        
        for(String element: list){
            System.out.print(element + " ");
        }
        
        System.out.println();
        
        if(iter.hasPrevious()){iter.previous();iter.add("new word");} // we can see that .add() only adds element right before the iterator position 
        
        for(String element: list){
            System.out.print(element + " ");
        }
    }
}