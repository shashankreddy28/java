import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTesting{
    public static void main(String[] args){
        Set<String> set = new HashSet<>(); // we can use hashset on string as it has implemented the equals and hashcode methods.
        set.add("Bro");
        set.add("Hi");
        set.add("Hello");
        set.add("Hi");//sets dont allow duplicate elements, this statement is ignored as Hi already exists
        for(String element:set){System.out.println(element);} // elements are not printed in teh order they are inserted
        
        Iterator<String> iter = set.iterator(); // this is iterator not listiterator so it doesnt have the .add() method.
        
        System.out.println();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}