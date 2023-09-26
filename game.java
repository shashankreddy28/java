import java.util.Scanner;
public class game {

    public static void createStructure(char[] gameList){
            System.out.printf(" %c | %c | %c \n",gameList[0] , gameList[1] , gameList[2]);
            System.out.println("--- --- ---");
            System.out.printf(" %c | %c | %c \n",gameList[3] , gameList[4] , gameList[5]);
            System.out.println("--- --- ---");
            System.out.printf(" %c | %c | %c \n",gameList[6] , gameList[7] , gameList[8]);
    }
    public static void main(String[] args){
        boolean gameOver =false;
        Scanner in = new Scanner(System.in);
        
        System.out.println("\nTic tac toe\n");
        int xCount = 0;
        int[] x = new int[5];
        int oCount = 0;
        int[] o = new int[4];
        char[] gameList = {'N','N','N','N','N','N','N','N','N'};
        for(int i=0;i<4;i++){
            System.out.println("Player 'x' enter number bw 1 & 9:");
            int xInput = in.nextInt();
            if(xInput>=1 && xInput<=9){
                x[xCount]=xInput;
                xCount++;
                for(int element :x){
                    if (element>=1 && element <=9){gameList[element-1]='X';}
                }
                createStructure(gameList);
            }
            if (!gameOver){
                System.out.println("Player 'o' enter number bw 1 & 9:");
                int oInput = in.nextInt();
                if(oInput>=1 &&oInput<=9){
                    o[oCount]=oInput;
                    oCount++;
                    for(int element :o){
                        if (element>=1 && element <=9){gameList[element-1]='O';}
                    }
                    createStructure(gameList);
                }
            }
        }
        in.close();
    }
    
}
