package com.workshop.tictactoe;

import java.util.Scanner;

public class TicTacToeUC3 {
    private char[] board;
    private int moves;
    public TicTacToeUC3() {
        board = new char[9];
        initializeBoard();
        moves = 0;
    }

    private void initializeBoard() {
        for ( int i = 0;i< board.length; i++){
            board[i] = ' ';
        }
    }
    public void myFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game Is ON");
        char[] players = {'X','O'};
        while (moves<9){
            char currentPlayer = players[moves%2];
            System.out.println("Player"+ currentPlayer +" Enter Position ) 0 to 8 ");
            int position = scanner.nextInt();

            if (position >= 0 && position < 9 && board[position] == ' ') {
                board[position] = currentPlayer;
                moves++;
                System.out.println(" Entry sucess");
                showBoard();
            }
                else{
                System.out.println(" Invalid position or its occupied TRY AGAIN");

            }
            }
        System.out.println(" all slots are filled , Enter  new position from 0 to 8");
        int position = scanner.nextInt();
        scanner.close();
        }

    private void showBoard() {
        System.out.println("Board:");
        System.out.println(board[0] + "|" + board[1]+ "|" board[1]+ "|"+ board[2]);
        System.out.println(board[3] + "|" + board[4]+ "|" board[1]+ "|"+ board[5]);
        System.out.println(board[6] + "|" + board[7]+ "|" board[1]+ "|"+ board[8]);
    }

    public static void main(String[] args) {
        TicTacToeUC3 obj = new TicTacToeUC3();
        obj.myFunction();
    }
}

