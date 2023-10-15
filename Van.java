import java.util.ArrayList;
 
/**
   This class models a shuttle van.
   keeps track of names of passengers in the object, not in the class
*/
public class Van
{
   // Instance variables
   /* Your code goes here */
   private int maxPassengers;
   private int currentPassengers;
   private ArrayList<String> names = new ArrayList<>();
   private int distance;
   /**
      Constructs a van with a given capacity.
      @param maxPassengers the maximum number of passengers that this
      van can hold
   */
   public Van(int maxPassengers)
   {
      this.maxPassengers = maxPassengers;
      this.currentPassengers = 0;
      this.distance = 0;
   }
 
   /**
      Boards a passenger up to the capacity of this van.
      @param name the name of the passenger attempting
      to board
   */
   public void board(String name)
   {
      if(this.currentPassengers<this.maxPassengers){
         this.currentPassengers++;
         this.names.add(name);
         }
   }
 
   /**
      Drives the van and discharges the passengers.
      @param distance the distance driven
   */
   public void drive(double distance)
   {
      this.distance+=distance;
      this.currentPassengers = 0;
      this.names.clear(); //arraylist.clear() removes everything form the arraylist
   }
 
   /**
      Gets the passengers in this van.
      @return a list of passengers
   */
   public ArrayList<String> getPassengers()
   {
      return this.names;
   }
 
   /**
      Gets the number of miles that this van has driven.
      @return the number of miles
   */
   public double getMilesDriven()
   {
      return this.distance;
   }
}



// /**
//    This class models a shuttle van.
// */
// public class Van
// {
//    // Instance variables
//    private int currentPassengers;
//    private int maxPassengers;
//    private double distance;
//    /* Your code goes here */
 
//    /**
//       Constructs a van with a given capacity.
//       @param maxPassengers the maximum number of passengers that this
//       van can hold
//    */
//    public Van(int maxPassengers)
//    {
//       this.maxPassengers = maxPassengers;
//       this.currentPassengers = 0;
//       this.distance = 0;
      
//    }

//    /**
//       Boards passengers up to the capacity of this van.
//       @param boardingPassengers the number of passengers attempting
//       to board
//    */
//    public void board(int boardingPassengers)
//    {
//       if(currentPassengers+boardingPassengers>=maxPassengers){this.currentPassengers = maxPassengers;}
//       else {this.currentPassengers+=boardingPassengers;}
//    }
 
//    /**
//       Drives the van and discharges the passengers.
//       @param distance the distance driven
//    */
//    public void drive(double distance)
//    {
//       this.distance+=distance;
//       this.currentPassengers=0;
//    }
 
//    /**
//       Gets the number of passengers in this van.
//       @return the number of passengers
//    */
//    public int getPassengers()
//    {
//       return this.currentPassengers;
//    }
 
//    /**
//       Gets the number of miles that this van has driven.
//       @return the number of miles
//    */
//    public double getMilesDriven()
//    {
//       return this.distance;
//    }
// }


