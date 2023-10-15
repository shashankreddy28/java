public class VanTester
{
   public static void main(String[] args)
   {
      Van van1 = new Van(8);
      van1.board("Fred");
      van1.board("Ann");
      van1.board("Lee");
      System.out.println("Your output: " + van1.getPassengers());
      System.out.println("Expected: [Fred, Ann, Lee]");
      System.out.println();
      
      van1.board("Tim");
      van1.board("Joe");
      van1.board("Pat");
      van1.board("May");
      van1.board("Sue");
      van1.board("Sally");
      System.out.println("Your output: " + van1.getPassengers());
      System.out.println("Expected: [Fred, Ann, Lee, Tim, Joe, Pat, May, Sue]");
      System.out.println();
      
      van1.drive(10);
      System.out.println("Your output: " + van1.getPassengers());
      System.out.println("Expected: []");
      System.out.println();
      
      System.out.println("Your output: " + van1.getMilesDriven());
      System.out.println("Expected: 10");
      System.out.println();
      
      van1.board("Sally");
      System.out.println("Your output: " + van1.getPassengers());
      System.out.println("Expected: [Sally]");
      System.out.println();
      
      van1.drive(12);
      System.out.println("Your output: " + van1.getPassengers());
      System.out.println("Expected: []");
      System.out.println();
      
      System.out.println("Your output: " + van1.getMilesDriven());
      System.out.println("Expected: 22");
   }
}

//testing for Van.java part2

// public class VanTester
// {
//    public static void main(String[] args)
//    {
//       Van van1 = new Van(8);
//       van1.board(3);
//       System.out.println(van1.getPassengers());
//       System.out.println("Expected: 3");
//       van1.board(6);
//       System.out.println(van1.getPassengers());
//       System.out.println("Expected: 8");
//       van1.drive(10);
//       System.out.println(van1.getPassengers());
//       System.out.println("Expected: 0");
//       System.out.println(van1.getMilesDriven());
//       System.out.println("Expected: 10");
//       van1.board(6);
//       System.out.println(van1.getPassengers());
//       System.out.println("Expected: 6");
//       van1.drive(12);
//       System.out.println(van1.getPassengers());
//       System.out.println("Expected: 0");
//       System.out.println(van1.getMilesDriven());
//       System.out.println("Expected: 22");
//    }
// }