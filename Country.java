import java.util.Arrays;

public class Country implements Comparable<Country>{ // class needs to implement comparable if you need to use array.sort
    private String name;
    private int area;
    
    public Country (String name, int area){
        this.area = area;
        this.name = name;
    }
    public int compareTo(Country other){
        return this.area-other.area;
    }

    public String getName(){
        return this.name;
    }
    public int getArea(){
        return this.area;
    }
    public String toString(){
        return "Country: "+name+" Area: "+area+" ";
    }

    public static void main(String[] args){
        Country india = new Country("India", 100);
        Country US = new Country("US", 90);
        Country UK = new Country("UK",99);
        Country UAE = new Country("UAE", 60);
        Country Alaska = new Country("Alaska", 110);
        Country Bahamas = new Country("Bahamas", 10);
        Country[] countries = {india,Alaska,Bahamas,US,UK,UAE};
        System.out.println();
        printObjects(countries);
        System.out.println();
        Arrays.sort(countries);
        System.out.println("Printing sorted countries based on area");
        System.out.println();
        printObjects(countries);
        System.out.println();

        CountryComparator comparingObj = new CountryComparator();
        System.out.println(comparingObj.compare(UK, UAE)); // would return negative number if UK was supposed to come before UAE, 0 if they have same name and positive when UK comes after UAE
        System.out.println();
        Arrays.sort(countries, new CountryComparator());
        System.out.println("Printing sorted countries based on name");
        System.out.println();
        printObjects(countries);




    }
    public static void printObjects(Object[] objects){
        for(Object obj:objects){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}