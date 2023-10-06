import java.util.Scanner;
public class game {


//error in while loop (logical error)
    public static boolean checkGameOver(char[] gameList,int[] x , int[] o){
        boolean status = false;
        if (rowsCheck(gameList, x, o) == 'X' || rowsCheck(gameList, x, o) == 'O'){
            status = true;
        }
        else if (columnsCheck(gameList, x, o) == 'X' || columnsCheck(gameList, x, o) == 'O'){
            status = true;
        }
        else if (diagnolsCheck(gameList, x, o) == 'X' || diagnolsCheck(gameList, x, o) == 'O'){
            status = true;
        }
        return status;

    }

    public static char rowsCheck(char[] gameList,int[] x , int[] o){
        char returnVal ='N';
        if(gameList[0] == gameList[1] && gameList[1] == gameList[2]){
            returnVal = gameList[0];
        }
        else if(gameList[3] == gameList[4] && gameList[4] == gameList[5]){
            returnVal = gameList[3];
        }
        else if(gameList[6] == gameList[7] && gameList[7] == gameList[8]){
            returnVal = gameList[6];
        }
        return returnVal;
        

    }
    // potential column check func
    // public static boolean checkCol(String[][] board, int col)
    // {
    //   boolean misMatch = false;
    //   String firstVal = board[0][col]; 
    //   for(int row = 1; row<board.length;row++){
    //      if(firstVal!=board[row][col]){
    //         misMatch=true;
    //         break;
    //      }
    //   }
    //   return !misMatch/* Your code goes here */;
    // }

    public static char columnsCheck(char[] gameList,int[] x , int[] o){
        char returnVal ='N';
        if(gameList[0] == gameList[3] && gameList[3] == gameList[6]){
            returnVal = gameList[0];
        }
        else if(gameList[1] == gameList[4] && gameList[4] == gameList[7]){
            returnVal = gameList[1];
        }
        else if(gameList[2] == gameList[5] && gameList[5] == gameList[8]){
            returnVal = gameList[2];
        }
        return returnVal;

    }

    public static char diagnolsCheck(char[] gameList,int[] x , int[] o){
        char returnVal ='N';
        if(gameList[0] == gameList[4] && gameList[4] == gameList[8]){
            returnVal = gameList[0];
        }
        else if(gameList[2] == gameList[4] && gameList[4] == gameList[6]){
            returnVal = gameList[2];
        }
        return returnVal;

    }

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
            int xInput;
            int xIndex;
            do{
                System.out.println("Player 'x' enter number bw 1 & 9:");
                xInput = in.nextInt();
                xIndex = xInput-1; // this is basically converting the user's input to the index on the list, like if they want to enter 1 but the index of first element is 0.
                if((xInput>=1 && xInput<=9)&&(gameList[xIndex]!='X'&&gameList[xIndex]!='O')){
                    x[xCount]=xInput;
                    xCount++;
                    for(int element :x){
                        if (element>=1 && element <=9){gameList[element-1]='X';}
                    }
                    //createStructure(gameList);
                }
            }
            while(!(xInput>=1 && xInput<=9) || !(gameList[xIndex]!='X' && gameList[xIndex]!='O'));
            if (!gameOver){
                int oInput;
                int oIndex;
                do{
                System.out.println("Player 'o' enter number bw 1 & 9:");
                oInput = in.nextInt();
                oIndex = oInput - 1;
                if((oInput>=1 &&oInput<=9)&&(gameList[oIndex]!='X'&&gameList[oIndex]!='O')){
                    o[oCount]=oInput;
                    oCount++;
                    for(int element :o){
                        if (element>=1 && element <=9){gameList[element-1]='O';}
                    }
                    // createStructure(gameList);
                }
            }while(!(oInput>=1 &&oInput<=9) || !(gameList[oIndex]!='X'&&gameList[oIndex]!='O'));
            }
        createStructure(gameList);
        }
        in.close();
    }
    
}



