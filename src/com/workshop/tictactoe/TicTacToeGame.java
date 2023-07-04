package com.workshop.tictactoe;

public class TicTacToeGame {
    private char[] board;
    public TicTacToeGame(){
        board = new char[10];
        initializeBoardUC1();
       }
       private void initializeBoardUC1() {
        for (int i =0; i< board.length; i++){
            board[i] = ' ';

        }
    }
    public void myFunction(){


    }

    public static void main(String[] args) {
        TicTacToeGame obj = new TicTacToeGame();
    }
}