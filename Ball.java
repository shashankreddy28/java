/**
   This class models a ball that bounces off walls.
   when walls are set.
   can test using BallTester.java
*/
public class Ball
{
   // Instance variables
   /* Your code goes here */
   private int curXPos;
   private int curXDir;
   private int curYPos;
   private int curYDir;
   private char lastV; //keeps track of last vertical side that was hit
   private char lastH; //keeps track of last horizontal side that was hit
   private int rightWall;
   private int topWall;
   /**
      Constructs a ball at (0, 0) traveling northeast.
      @param rightWall the position of the wall to the right
      @param topWall the position of the wall at the top
   */
   public Ball(int rightWall, int topWall)   
   {
      this.curXPos = 0;
      this.curYPos = 0;
      this.curXDir = 1;
      this.curYDir = 1;
      this.rightWall = rightWall;
      this.topWall = topWall;
      this.lastV = 'L';
      this.lastH = 'B';
      
   }
 
   /**
      Moves the ball.
   */
   public void move()
   {
      if(lastV=='L'){
         if (curXPos!=rightWall){
         curXPos+=curXDir;
         }
         else if (curXPos==rightWall){
            turn();
            curXPos+=curXDir;
            lastV = 'R';
         }
      }
      else if(lastV=='R'){
         if (curXPos!=0){
         curXPos+=curXDir;
         }
         else if (curXPos==0){
            turn();
            curXPos+=curXDir;
            lastV = 'L';
         }
      }
      
      if(lastH=='B'){
         if (curYPos!=topWall){
         curYPos+=curYDir;
         }
         else if (curYPos==topWall){
            turn();
            curYPos+=curYDir;
            lastH = 'T';
         }
      }
      else if(lastH=='T'){
         if (curYPos!=0){
         curYPos+=curYDir;
         }
         else if (curYPos==0){
            turn();
            curYPos+=curYDir;
            lastH = 'B';
         }
      
      }
   }
 
   /**
      Turns the ball direction 90 degrees clockwise.
   */
   private void turn()
   {
      if(curXPos==0){curXDir = 1;}
      else if(curXPos==rightWall){curXDir = -1;}
      if(curYPos==0){curYDir = 1;}
      else if(curYPos==topWall){curYDir = -1;}
      
   }
 
   /**
      Gets the current x-position.
      @return the x-position
   */
   public int getX()
   {
      return curXPos;
   }
 
   /**
      Gets the current y-position.
      @return the y-position
   */
   public int getY()
   {
      return curYPos;
   }
}



// /**
//    This class models a ball that bounces off walls.
//    we can move the ball by 1 unit and changes direction once it hits right wall
// */
// public class Ball
// {
//    // Instance variables
//    /* Your code goes here */
//    private int rightWall;
//    private int currentPos;
//    private String lastHit;
 
//    /**
//       Constructs a ball at position 0 traveling east.
//       @param rightWall the position of the wall to the right
//    */
//    public Ball(int rightWall)
//    {
//       this.rightWall = rightWall;
//       this.currentPos = 0;
//       this.lastHit = "L";
//    }
 
//    /**
//       Moves the ball.
//    */
//    public void move()
//    {
//       if(this.lastHit.equals("L")){
//       if(this.currentPos!=this.rightWall){this.currentPos++;}
//       else{this.currentPos--;this.lastHit = "R";}
//       }
//       else if(this.lastHit.equals("R")){
//       if(this.currentPos!=0){this.currentPos--;}
//       else{this.currentPos++;this.lastHit = "L";}
//       }
//    }
 
//    /**
//       Gets the current position.
//       @return the current position
//    */
//    public int getPosition()
//    {
//       return this.currentPos;
//    }
// }