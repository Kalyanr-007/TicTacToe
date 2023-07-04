package com.workshop.tictactoe;

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
    
}
