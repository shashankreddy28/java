/**
   This class models a ball that bounces off walls.
*/
public class Ball
{
   // Instance variables
   /* Your code goes here */
   private int rightWall;
   private int currentPos;
   private String lastHit;
 
   /**
      Constructs a ball at position 0 traveling east.
      @param rightWall the position of the wall to the right
   */
   public Ball(int rightWall)
   {
      this.rightWall = rightWall;
      this.currentPos = 0;
      this.lastHit = "L";
   }
 
   /**
      Moves the ball.
   */
   public void move()
   {
      if(this.lastHit.equals("L")){
      if(this.currentPos!=this.rightWall){this.currentPos++;}
      else{this.currentPos--;this.lastHit = "R";}
      }
      else if(this.lastHit.equals("R")){
      if(this.currentPos!=0){this.currentPos--;}
      else{this.currentPos++;this.lastHit = "L";}
      }
   }
 
   /**
      Gets the current position.
      @return the current position
   */
   public int getPosition()
   {
      return this.currentPos;
   }
}