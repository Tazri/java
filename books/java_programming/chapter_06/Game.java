package books.java_programming.chapter_06;

public class Game {
    public static void main(String[]args){
        TicTacToe game = new TicTacToe();
        game.startGame();
    }
}

/*
Sample Output : 
Welcome to Tic Tac Toe!
What's your name?
Bazlur
Who are you playing with? 
Bruno
Who is playing first? press
1 for Bazlur
2 for Bruno
1
|---|---|---|
|   |   |   |
|---|---|---|
|   |   |   |
|---|---|---|
|   |   |   |
|---|---|---|
Bazlur's turn
Enter a row number(0, 1 or 2) : 0
Enter a column number (0, 1 or 2) : 0
|---|---|---|
| X |   |   |
|---|---|---|
|   |   |   |
|---|---|---|
|   |   |   |
|---|---|---|
Bruno's turn
Enter a row number(0, 1 or 2) : 2
Enter a column number (0, 1 or 2) : 2
|---|---|---|
| X |   |   |
|---|---|---|
|   |   |   |
|---|---|---|
|   |   | O |
|---|---|---|
Bazlur's turn
Enter a row number(0, 1 or 2) : 0
Enter a column number (0, 1 or 2) : 2
|---|---|---|
| X |   | X |
|---|---|---|
|   |   |   |
|---|---|---|
|   |   | O |
|---|---|---|
Bruno's turn
Enter a row number(0, 1 or 2) : 0
Enter a column number (0, 1 or 2) : 1
|---|---|---|
| X | O | X |
|---|---|---|
|   |   |   |
|---|---|---|
|   |   | O |
|---|---|---|
Bazlur's turn
Enter a row number(0, 1 or 2) : 2
Enter a column number (0, 1 or 2) : 0
|---|---|---|
| X | O | X |
|---|---|---|
|   |   |   |
|---|---|---|
| X |   | O |
|---|---|---|
Bruno's turn
Enter a row number(0, 1 or 2) : 1
Enter a column number (0, 1 or 2) : 1
|---|---|---|
| X | O | X |
|---|---|---|
|   | O |   |
|---|---|---|
| X |   | O |
|---|---|---|
Bazlur's turn
Enter a row number(0, 1 or 2) : 0
Enter a column number (0, 1 or 2) : 1
Someone has alread made a move at this position, try again
Enter a row number(0, 1 or 2) : 1
Enter a column number (0, 1 or 2) : 0
|---|---|---|
| X | O | X |
|---|---|---|
| X | O |   |
|---|---|---|
| X |   | O |
|---|---|---|
? Game over! ?
Bazlur won the game, Congratulation! ??
*/