import java.util.Comparator;

public class CountryComparator implements Comparator<Country>{ // we create objects of this just when we comaper country objects using name and not area
    public int compare(Country first, Country second){
        return first.getName().compareTo(second.getName());
    }
}