public class BallTester
{
   public static void main(String[] args)
   {
      Ball ball1 = new Ball(6, 4);
      System.out.println(ball1.getX() + " " + ball1.getY());
      System.out.println("Expected: 0 0");
      ball1.move();
      System.out.println(ball1.getX() + " " + ball1.getY());
      System.out.println("Expected: 1 1");
      ball1.move();
      System.out.println(ball1.getX() + " " + ball1.getY());
      System.out.println("Expected: 2 2");
      ball1.move();
      ball1.move();
      System.out.println(ball1.getX() + " " + ball1.getY());
      System.out.println("Expected: 4 4");
      ball1.move();
      System.out.println(ball1.getX() + " " + ball1.getY());
      System.out.println("Expected: 5 3");
      ball1.move();
      System.out.println(ball1.getX() + " " + ball1.getY());
      System.out.println("Expected: 6 2");
      ball1.move();
      System.out.println(ball1.getX() + " " + ball1.getY());
      System.out.println("Expected: 5 1");
      ball1.move();
      System.out.println(ball1.getX() + " " + ball1.getY());
      System.out.println("Expected: 4 0");
      ball1.move();
      System.out.println(ball1.getX() + " " + ball1.getY());
      System.out.println("Expected: 3 1");

      Ball ball2 = new Ball(10, 10);
      for (int i = 1; i <= 12; i++) { ball2.move(); }
      System.out.println(ball2.getX() + " " + ball2.getY());
      System.out.println("Expected: 8 8");
   }
}

// for part2 of ball.java

// public class BallTester
// {
//    public static void main(String[] args)
//    {
//       Ball ball1 = new Ball(5);
//       System.out.println("Your output: " + ball1.getPosition());
//       System.out.println("Expected: 0");
//       System.out.println();
      
//       ball1.move();
//       System.out.println("Your output: " + ball1.getPosition());
//       System.out.println("Expected: 1");
//       System.out.println();
      
//       ball1.move();
//       System.out.println("Your output: " + ball1.getPosition());
//       System.out.println("Expected: 2");
//       System.out.println();
      
//       ball1.move();
//       ball1.move();
//       ball1.move();
//       System.out.println("Your output: " + ball1.getPosition());
//       System.out.println("Expected: 5");
//       System.out.println();
      
//       ball1.move();
//       System.out.println("Your output: " + ball1.getPosition());
//       System.out.println("Expected: 4");
//       System.out.println();
      
//       ball1.move();
//       ball1.move();
//       ball1.move();
//       ball1.move();
//       System.out.println("Your output: " + ball1.getPosition());
//       System.out.println("Expected: 0");
//       System.out.println();
      
//       ball1.move();
//       System.out.println("Your output: " + ball1.getPosition());
//       System.out.println("Expected: 1");
//       System.out.println();
  
//       Ball ball2 = new Ball(10);
//       for (int i = 1; i <= 42; i++) 
//       { 
//          ball2.move();
//       }
//       System.out.println("Your output: " + ball2.getPosition());
//       System.out.println("Expected: 2");
//    }
// }