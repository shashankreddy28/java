import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        System.out.println("\n\n\n    Hello, Lets Play Tic Tac Toe\n\n\n");
        Scanner in = new Scanner(System.in);
        System.out.print("\'X\' Player Enter your Name: ");
        String playerXName = in.nextLine();
        System.out.print("\'O\' Player Enter your Name: ");
        String playerOName = in.nextLine();
        String playAgain;
        do{
            gameBoard game1 = new gameBoard(playerXName,playerOName);
            game1.startNewGame();
            System.out.println("Would you like to play again?(y/n): ");

            playAgain = in.next();
        }
        while(playAgain.equals("y"));
        in.close();
        
    }
    
}
class gameBoard{
    private char[][] contents;
    private int occupied;
    private player player1;
    private player player2;
    private player currentPlayer;
    private player lastPlayedPlayer;
    public gameBoard(String playerXName,String playerOName){
        this.contents = new char[][]{
            {'n','n','n'},
            {'n','n','n'},
            {'n','n','n'}
        };
        this.occupied =0;
        player1 = new player(playerXName,'X');
        player2 = new player(playerOName,'O');
        currentPlayer = player1;
        lastPlayedPlayer = player2;
    }

    public void startNewGame(){
        Scanner input = new Scanner(System.in);
        while(!this.isGameOver()){
            currentPlayer.play(this,input);
            player temp = currentPlayer;
            currentPlayer = lastPlayedPlayer;
            lastPlayedPlayer = temp;
        }
        
    }
    /**
     * returns true if game is over
     * @param most recent entry of row(1,2,3)
     * @param most recent entry of column(1,2,3)
     * @return true is game is over. 
     */

    public boolean isGameOver(){
        if(this.occupied==9){ 
            if(!(checkRows() || checkColumns() || checkDiagnols()))
            {
                System.out.println("Game was a Tie.");  
                return true;  
            }
        }
        System.out.println("Occupied: "+occupied);
        return checkRows() || checkColumns() || checkDiagnols();
    }
        
    
    public boolean checkRows(){
        for(int x = 1;x<4;x++){

            if((contents[x-1][0]!='n') && (contents[x-1][0] == contents[x-1][1] )&& (contents[x-1][0] == contents[x-1][2])){
                System.out.println(lastPlayedPlayer.getName()+" Wins! ");
                lastPlayedPlayer.celebrate();
                return true;
            }
        }
            return false;
    }

    public boolean checkColumns(){
        for(int x = 1;x<4;x++){

            if(contents[0][x-1]!='n' && contents[0][x-1]==contents[1][x-1] && contents[0][x-1] == contents[2][x-1]){
                System.out.println(lastPlayedPlayer.getName()+" Wins! ");
                lastPlayedPlayer.celebrate();
                return true;
            }
    }
        return false;
    }
    public boolean checkDiagnols(){
        if(contents[1][1]!='n'){
            if(contents[0][0]==contents[1][1] && contents[1][1]==contents[2][2]){
                System.out.println(lastPlayedPlayer.getName()+" Wins! ");
                lastPlayedPlayer.celebrate();
                return true;
            }
            else if(contents[0][2]==contents[1][1] && contents[1][1]==contents[2][0]){
                System.out.println(lastPlayedPlayer.getName()+" Wins! ");
                lastPlayedPlayer.celebrate();
                return true;
            }
            else{return false;}

        }
        else{return false;}
    }
    public void createTemplate(){
        System.out.println("   Game Template:-\n");
        System.out.printf("      %d | %d | %d \n",1,2,3);
        System.out.println("     --- --- ---");
        System.out.printf("      %d | %d | %d \n",4,5,6);
        System.out.println("     --- --- ---");
        System.out.printf("      %d | %d | %d \n",7,8,9);
        System.out.println();
    }
    public void createStructure(){
        createTemplate();
        System.out.println("   Current Game Structure:-\n");
        System.out.printf("      %c | %c | %c \n",contents[0][0],contents[0][1],contents[0][2]);
        System.out.println("     --- --- ---");
        System.out.printf("      %c | %c | %c \n",contents[1][0],contents[1][1],contents[1][2]);
        System.out.println("     --- --- ---");
        System.out.printf("      %c | %c | %c \n",contents[2][0],contents[2][1],contents[2][2]);
        System.out.println();
    }
    public boolean setValue(int pos, char value){
        if (this.occupied == 9){return false;}
        else if(pos>9 || pos<1){System.out.println("Position is out of index.");return false;}
        else{
            if(pos<=3){
                if(contents[0][pos-1]=='n'){
                    contents[0][pos-1] = value ;
                    occupied++;
                    createStructure();
                    return true;
                }
                else{System.out.println("Pos already has value."); return false;}

            }
            else if(pos<=6){
                if(contents[1][pos-4]=='n'){
                    contents[1][pos-4] = value ;
                    occupied++;
                    createStructure();
                    return true;
                }
                else{System.out.println("Pos already has value."); return false;}
            }
            else{
                if(contents[2][pos-7]=='n'){
                    contents[2][pos-7] = value;
                    occupied++;
                    createStructure();
                    return true;
                }
                else{System.out.println("Pos already has value."); return false;}
            }
            
        }
    }
    public int getOccupied(){
        return occupied;
    }
}



class player{
    private String name;
    private char value;
    public player(char value){
        this("Unknown",value);
    }
    public player(String name, char value){
        this.name = name;
        this.value = value;
    }
    public void play(gameBoard game,Scanner in){
        boolean ValSet;
        if(game.getOccupied()==0){
            game.createStructure();
        }
        do{
        System.out.print(this.getName()+"\'s turn to play. \n Enter the position: ");
        int input = in.nextInt();
        ValSet = game.setValue(input, value);
        }
        while(!ValSet);
    }
    public char getValue(){
        return this.value;
    }
    public String getName(){
        return this.name;
    }
    public void celebrate(){
        System.out.println("See I told you I ("+getName()+") am the best at tic tac toe.");
    }
}
