public class Coin{
    private int value;
    private String name;
    private static int number;
    private static int total;
    
    public Coin(int value , String name){
        this.value = value;
        this.name = name;
        total+=this.value;
        number++;

    }
    public int getValue(){
        return this.value;
    }
    public String getName(){
        return this.name;
    }
    public static int getTotalNumber(){
        return number;
    }
    public static int getTotalValue(){
        return total;
    }


}