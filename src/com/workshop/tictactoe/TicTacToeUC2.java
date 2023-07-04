package com.workshop.tictactoe;

import java.util.Scanner;

public class TicTacToeUC2 {
    private char[] board;

    public TicTacToeUC2() {
        board = new char[10];
        initializeBoardUC1();
    }

    private void initializeBoardUC1() {
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';

        }
    }

    public void myFunction() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter X or O");
        char playerinput = scanner.next().charAt(0);
        scanner.close();
        if (playerinput == 'X' || playerinput == 'O') {
            System.out.println("Valid Input");
        }
            else {
            System.out.println(" Invalid input" + playerinput + "Please Enter Either X  or O");



            }
        }

    public static void main(String[] args) {
        TicTacToeGame obj = new TicTacToeGame();
        obj.myFunction();
    }

    }


