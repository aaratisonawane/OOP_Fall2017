package com.company;

public class Main {

    public static void main(String[] args) {
        int table[][] = new int[3][4];


        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                table[i][j] = 4 * i + j + 1;


        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++)
                System.out.print(table[i][j] + "\t");
            System.out.println();

            }


        }
    }

