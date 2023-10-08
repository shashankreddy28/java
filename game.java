import java.util.Scanner;
public class game {


//error in while loop (logical error)
    public static boolean checkGameOver(char[] gameList,int[] x , int[] o){
        boolean status = false;
        if (rowsCheck(gameList) == 'X' || rowsCheck(gameList) == 'O'){
            status = true;
            System.out.printf("Player %c wins the game.\n",rowsCheck(gameList));
        }
        else if (columnsCheck(gameList) == 'X' || columnsCheck(gameList) == 'O'){
            status = true;
            System.out.printf("Player %c wins the game.\n",columnsCheck(gameList));
        }
        else if (diagnolsCheck(gameList) == 'X' || diagnolsCheck(gameList) == 'O'){
            status = true;
            System.out.printf("Player %c wins the game.\n",diagnolsCheck(gameList));
        }
        return status;

    }

    public static char rowsCheck(char[] gameList){
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

    public static char columnsCheck(char[] gameList){
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

    public static char diagnolsCheck(char[] gameList){
        char returnVal ='N';
        if(gameList[0] == gameList[4] && gameList[4] == gameList[8]){
            returnVal = gameList[0];
        }
        else if(gameList[2] == gameList[4] && gameList[4] == gameList[6]){
            returnVal = gameList[2];
        }
        return returnVal;

    }

    public static void createTemplate(){
        System.out.println("Here is the template for referance:");
        System.out.print(" 1 | 2 | 3 \n");
        System.out.println("--- --- ---");
        System.out.print(" 4 | 5 | 6 \n");
        System.out.println("--- --- ---");
        System.out.print(" 7 | 8 | 9 \n");
}

    public static void createStructure(char[] gameList){
            System.out.printf(" %c | %c | %c \t 1 | 2 | 3 \n",gameList[0] , gameList[1] , gameList[2]);
            System.out.println("--- --- --- \t--- --- ---");
            System.out.printf(" %c | %c | %c \t 4 | 5 | 6 \n",gameList[3] , gameList[4] , gameList[5]);
            System.out.println("--- --- --- \t--- --- ---");
            System.out.printf(" %c | %c | %c \t 7 | 8 | 9 \n",gameList[6] , gameList[7] , gameList[8]);
    }
    public static void main(String[] args){
        boolean gameOver =false;
        Scanner in = new Scanner(System.in);
        
        System.out.println("\nTic tac toe\n");
        createTemplate();
        int xCount = 0; // number of times player x plays
        int[] x = new int[5];
        int oCount = 0; // number of times player o plays
        int[] o = new int[4];
        char[] gameList = {'N','N','N','N','N','N','N','N','N'};



        for(int i=0;i<4;i++){
            if(!gameOver){
                //if(!gameOver){
                    int xInput;
                    int xIndex;
                    do{
                        System.out.println("Player 'X' enter position to place 'X':");
                        // createTemplate();
                        xInput = in.nextInt();
                        xIndex = xInput-1; // this is basically converting the user's input to the index on the list, like if they want to enter 1 but the index of first element is 0.
                        if((xInput>=1 && xInput<=9)&&(gameList[xIndex]!='X'&&gameList[xIndex]!='O')){
                            x[xCount]=xInput;
                            gameList[xIndex]='X';
                            gameOver = checkGameOver(gameList, x, o);
                            xCount++;
                            createStructure(gameList);
                        }
                    }
                    while(!(xInput>=1 && xInput<=9)&&(gameList[xIndex]!='X'&&gameList[xIndex]!='O')); // makes sure user enters valid input
                //}
            if (!gameOver){
                int oInput;
                int oIndex;
                do{
                System.out.println("Player 'O' enter position to place 'O':");
                oInput = in.nextInt();
                oIndex = oInput - 1;
                if((oInput>=1 &&oInput<=9)&&(gameList[oIndex]!='X'&&gameList[oIndex]!='O')){
                    o[oCount]=oInput;
                    gameList[oIndex]='O';
                    gameOver = checkGameOver(gameList, x, o);
                    oCount++;
                    createStructure(gameList);

                    // createStructure(gameList);
                }
            }while(!(oInput>=1 &&oInput<=9)&&(gameList[oIndex]!='X'&&gameList[oIndex]!='O'));
            }
        // createStructure(gameList);
        }
        }//end of for loop
        if(!gameOver)
        {for(int i =0; i<gameList.length;i++){
            if(gameList[i]=='N'){
                gameList[i]='X';
            }
        }
        gameOver = checkGameOver(gameList, x, o);
        }
        if(!gameOver){System.out.println("Tie");}
        in.close();
    }
    
}



