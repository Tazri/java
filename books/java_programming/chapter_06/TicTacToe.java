package books.java_programming.chapter_06;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe{
    private static final char EMPTY_BOX = ' ';
    private static final char PLAYER_ONES_SYMBOL = 'X';
    private static final char PLAYER_TWOS_SYMBOL = 'O';

    private final char[][] gameBoard = new char[3][3];

    private final Scanner input = new Scanner(System.in);

    private String playerOne;
    private String playerTwo;

    private String currentPlayer;
    private String whoWonTheGame;

    /*
     * startGame() : 
     * 
     */
    public void startGame(){
        initializeBoard();
        askForUserNames();

        while(isGameNotOver()){
            drawBoard();
            pritnPlayerTurn();
            askForManeuver();
        }

        printGameOver();
    }

    /*
     * initializeBourd() :
     * - initialize the gameBoard to ' '
     * 
     */
    private void initializeBoard(){
        for(char[] chars: gameBoard){
            Arrays.fill(chars,EMPTY_BOX);
        }
    }

    /*
     * askForUserNames() :
     * - set the playerOne name.
     * - set the playerTwo name.
     * - set the currentPlayer according to user choose.
     * 
     */
    private void askForUserNames(){
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("What's your name?");
        playerOne = input.nextLine();

        System.out.println("Who are you playing with? ");
        playerTwo = input.nextLine();

        System.out.println("Who is playing first? press"+"\n1 for "+playerOne+"\n2 for "+playerTwo);

        int player = input.nextInt();
        currentPlayer = player == 1 ? playerOne : playerTwo;
    }

    /*
     * isGameNotOver() :
     * - return game is over or not.
     * - check any player is win.
     * - check board is full.
     * 
     */
    private boolean isGameNotOver(){
        return !(isBoardIsFull() || hasAnyPlayerWon());
    }

    /*
     * drawBoard() :
     * - draw the board according to gameBoard array
     * 
     */
    private void drawBoard(){
        System.out.println("|---|---|---|");
        for(char[]chars:gameBoard){
            System.out.printf("| %c | %c | %c |%n",chars[0],chars[1],chars[2]);
            System.out.println("|---|---|---|");
        }
    }

    /*
     * printPlayerTurn() : 
     * - print the current player who is playing
     * 
     */
    private void pritnPlayerTurn(){
        System.out.println(whoIsPlaying()+"'s turn");
    }

    /*
     * askForManeuver() : 
     * - gat the currentPlayer input utill provide valid input
     * - set the slot of gameBoard according to player input
     * - change the currentPlayer to the opposite player
     * 
     */
    private void askForManeuver(){
        int row;
        int col;

        do{
            System.out.print("Enter a row number(0, 1 or 2) : ");
            row = input.nextInt();
            System.out.print("Enter a column number (0, 1 or 2) : ");
            col = input.nextInt();
        }while(!validateInput(row, col));

        if(whoIsPlaying().equals(playerOne)){
            gameBoard[row][col] = PLAYER_ONES_SYMBOL;
            currentPlayer = playerTwo;
        }else{
            gameBoard[row][col] = PLAYER_TWOS_SYMBOL;
            currentPlayer = playerOne;
        }
    }

    /*
     * printGameOver() : 
     * - if any one won then print winner name.
     * - if no one win then print a message which inform that game is draw
     * 
     */
    private void printGameOver(){
        drawBoard();
        System.out.println("\uD83C\uDFAE Game over! \uD83C\uDFAE");

        if(whoWonTheGame != null){
            System.out.println(whoWonTheGame+" won the game, "+"Congratulation! \uD83C\uDF8A\uD83C\uDF89");
        }else{
            System.out.println("Sounds like it's a tie! Play again!");
        }
        
    }

    /*
     * isBoardIsFull() : 
     * - chack gameBoard array not fill with EMPTY_BOX or space(' ') character
     * 
     */
    private boolean isBoardIsFull(){
        boolean result = true;
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                if(gameBoard[i][j] == EMPTY_BOX){
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    /*
     * hasAnyPlayerWon() : 
     * - checking board row, column in diagonals
     * - set whoWonTheGame according to board
     * 
     */

    private boolean hasAnyPlayerWon(){
        char cross = ' ';

        // check each row
        for(int i = 0;i < 3;i++){
            if(gameBoard[i][0] == gameBoard[i][1] &&
               gameBoard[i][1] == gameBoard[i][2] &&
               gameBoard[i][0] != EMPTY_BOX){
                cross = gameBoard[i][0];
               }
        }

        // check each column
        for(int j = 0;j < 3;j++){
            if(gameBoard[0][j] == gameBoard[1][j] &&
               gameBoard[1][j] == gameBoard[2][j] &&
               gameBoard[0][j] != EMPTY_BOX){
                cross = gameBoard[0][j];
               }
        }

        // check the diagonals
        if(gameBoard[0][0] == gameBoard[1][1] &&
           gameBoard[1][1] == gameBoard[2][2] &&
           gameBoard[0][0] != EMPTY_BOX){
            cross = gameBoard[0][0];
        }

        if(gameBoard[2][0] == gameBoard[1][1] &&
           gameBoard[1][1] == gameBoard[0][1] &&
           gameBoard[2][0] != EMPTY_BOX){
            cross = gameBoard[2][0];
        }

        if(cross == PLAYER_ONES_SYMBOL){
            whoWonTheGame = playerOne;
        }else if(cross == PLAYER_TWOS_SYMBOL){
            whoWonTheGame = playerTwo;
        }

        return whoWonTheGame != null;
    }


    /*
     * whoIsPlaying() : 
     * - return the currentPlayer
     * 
     */
    private String whoIsPlaying(){
        return currentPlayer;
    }

    /*
     * private boolean validateInput() : 
     * - check input data for playing is valid or not
     * 
     */
    private boolean validateInput(int row,int col){
        boolean result = false;
        if(row < 0 || col < 0 || row > 2 || col > 2 ){
            System.out.println("The position is off the bounds "+"of the board, try again");
        }else if(gameBoard[row][col] != EMPTY_BOX){
            System.out.println("Someone has alread made a move "+ "at this position, try again");
        }else{
            result = true;
        }
        return result;
    }
}

/*
This game run in ./Game.java file.
*/