package com.company;

public class TwoDimensionalArrays {

    public static void main(String[] args) {

        // declarando e inicializando array bidimensional de tipo int 3x3
        int[][] initArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // declarando array bidimensional de tipo int 3x3
        int[][] twoDArr = new int[3][3];

        // insertando elementos en 2d array
        twoDArr[0][0] = 10;
        twoDArr[0][1] = 20;
        twoDArr[0][2] = 30;

        twoDArr[1][0] = 40;
        twoDArr[1][1] = 50;
        twoDArr[1][2] = 60;

        twoDArr[2][0] = 70;
        twoDArr[2][1] = 80;
        twoDArr[2][2] = 90;

        // imprimiendo array bidimensional con for
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                System.out.println(twoDArr[i][j]);
            }
        }

        // imprimiendo array bidimensional con foreach
        for(int[] i : initArr){
            for(int j : i){
                System.out.println(j);
            }
        }
    }
}
