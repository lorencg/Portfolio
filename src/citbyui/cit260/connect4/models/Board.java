/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.models;

import citbyui.cit260.connect4.exceptions.Connect4Exception;
import citbyui.cit260.connect4.exceptions.MenuException;
import static java.lang.Math.log;
import java.util.Objects;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.log;

/**
 *
 * @author SexyMama
 */
public class Board {

    Scanner in = new Scanner(System.in);
    private int printRow;
    private int printColumns;
    private final int columns = 7;
    private final char board[][] = new char[6][7];
    private int turn = 1;

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public int getPrintRow() {
        return printRow;
    }

    public void setPrintRow(int printRow) {
        this.printRow = printRow;
    }

    public int getPrintColumns() {
        return printColumns;
    }

    public void setPrintColumns(int printColumns) {
        this.printColumns = printColumns;
    }

    public void displayBoard() {
        System.out.println("1 | 2 | 3 | 4 | 5 | 6 | 7 |");
        for (printRow = 0; printRow < 6; ++printRow) {
            for (printColumns = 0; printColumns < 7; ++printColumns) {
                System.out.print(board[printRow][printColumns] + " | ");
            }
            System.out.println();
        }
    }

    public void Game() {
        char token1 = 'O';
        char token2 = 'X';
        int moveColumn;

        boolean gameOver = false;

        displayBoard();
        //clear board
        while (!gameOver) {

            //get move
            System.out.println("Please enter a column '1-7' or 0 to quit: ");
            moveColumn = in.nextInt() - 1;

            if (moveColumn == -1) {
                gameOver = true;
            } else {

                if (moveColumn <= columns - 1 && moveColumn >= 0) {
                    if (board[0][moveColumn] != 0) {
                        System.out.println("This spot is full.");
                    } else {
                        for (int i = 5; i >= 0; i--) {
                            if (board[i][moveColumn] == 0) {
                                if (turn % 2 == 0) {
                                    board[i][moveColumn] = token2;
                                    turn++;
                                    break;
                                } else {
                                    board[i][moveColumn] = token1;
                                    turn++;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("invalid move");
                }

                displayBoard();
                

            }
        }
    }

    //start 4 in a row check

    public boolean checkWinner()  {

        int checkWin = 0;       //Checks which char to search for
        boolean saveWin = false;
        char check;
        if (turn % 2 == 0) {
            check = 'X';
        } else {
            check = 'O';
        }

        //Checks Horizontal Patterns    
        for (int i = 0; i > 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == check && board[i][j + 1] == check) {
                    checkWin++;
                    if (checkWin == 3) {
                        return true;
                    }
                } else {
                    checkWin = 0;
                }
            }
        }

        //Checks Vertical Patterns
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 4; i++) {
                if (board[i][j] == check && board[i + 1][j] == check) {
                    checkWin++;
                    if (checkWin == 3) {
                        return true;
                    }
                } else {
                    checkWin = 0; 
                }
            }
        }

        //Upward Right
        for (int j = 8; j > 3; j++) {
            for (int i = 0; i < 5; i++) {
                try {
                    if (board[i][j - 1] == check && board[i + 1][j - 1 - i] == check) {
                        checkWin++;
                        if (checkWin == 3) {
                            return true;
                        }
                    } else {
                        checkWin = 0;
                    }
                }
                catch (ArrayIndexOutOfBoundsException e) {
                }
            }
            
        }

        //Downward right
        for (int j = -2; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                try {
                    if (board[i][j + i] == check && board[i + 1][j + 1 + i] == check) {
                        checkWin++;
                        if (checkWin == 3) {
                            return true;
                        }
                    } else {
                        checkWin = 0;
                    }
                }
                catch (ArrayIndexOutOfBoundsException e) {
                }
            }
        }
        return false;
    }

}
