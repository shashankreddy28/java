/**
   This class models a shuttle van.
*/
public class Van
{
   // Instance variables
   private int currentPassengers;
   private int maxPassengers;
   private double distance;
   /* Your code goes here */
 
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
      Boards passengers up to the capacity of this van.
      @param boardingPassengers the number of passengers attempting
      to board
   */
   public void board(int boardingPassengers)
   {
      if(currentPassengers+boardingPassengers>=maxPassengers){this.currentPassengers = maxPassengers;}
      else {this.currentPassengers+=boardingPassengers;}
   }
 
   /**
      Drives the van and discharges the passengers.
      @param distance the distance driven
   */
   public void drive(double distance)
   {
      this.distance+=distance;
      this.currentPassengers=0;
   }
 
   /**
      Gets the number of passengers in this van.
      @return the number of passengers
   */
   public int getPassengers()
   {
      return this.currentPassengers;
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