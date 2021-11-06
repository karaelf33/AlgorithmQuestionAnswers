package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;

/*
n=number of rows and column
k=number of obstacle
r_q=row number of quenn postion
c_q=column number of queen postion
obstacles[k][2]=
*/
public class queenAttack {
    public static int queensAttack(int n, int k, int queenY, int queenX, List<List<Integer>> obstacles) {

        int top = n - queenY;
        int bottom = queenY - 1;
        int left = queenX - 1;
        int right = n - queenX;
        int topLeft = Math.min(top, left);
        int topRight = Math.min(right, top);
        int bottomLeft = Math.min(left, bottom);
        int bottomRight = Math.min(bottom, right);


        for (List<Integer> obstacle : obstacles) {
            //vertical
            if (queenX == obstacle.get(1)) {
                //top
                if (queenY < obstacle.get(0)) {
                    top = Math.min(top, obstacle.get(0) - queenY - 1);
                }
                //bottom
                else if (queenY > obstacle.get(0)) {
                    bottom = Math.min(bottom, queenY - obstacle.get(0) - 1);
                }
            }
            //horizontal
            else if (queenY == obstacle.get(0)) {
                // left
                if (queenX > obstacle.get(1)) {
                    left = Math.min(left, queenX - obstacle.get(1) - 1);
                }
                // right
                else if (queenX < obstacle.get(1)) {
                    right = Math.min(right, obstacle.get(1) - queenX - 1);
                }
            }
            // for crosses
            //top
            if (queenY < obstacle.get(0) && Math.abs(queenX - obstacle.get(1)) == Math.abs(queenY - obstacle.get(0))) {
                //topLeft
                if (queenX > obstacle.get(1)) {
                    topLeft = Math.min(topLeft, queenX - obstacle.get(1) - 1);
                }
                //topRight
                else if (queenX < obstacle.get(1)) {
                    topRight = Math.min(topRight, obstacle.get(1) - queenX - 1);
                }
            }
            //bottom
            if (queenY > obstacle.get(0) && Math.abs(queenX - obstacle.get(1)) == Math.abs(queenY - obstacle.get(0))) {
                //bottomLeft
                if (queenX > obstacle.get(1)) {
                    bottomLeft = Math.min(bottomLeft, queenX - obstacle.get(1) - 1);
                }
                //bottomRight
                else if (queenX < obstacle.get(1)) {
                    bottomRight = Math.min(bottomRight, obstacle.get(1) - queenX - 1);
                }
            }

        }

        return topLeft + top + topRight + right + bottomRight + bottom + bottomLeft + left;
    }


    public static void main(String[] args) {
        List<List<Integer>> obstacles = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();
        List<Integer> row3 = new ArrayList<>();

        row1.add(5);
        row1.add(5);
        row2.add(4);
        row2.add(2);
        row3.add(2);
        row3.add(3);

        obstacles.add(row1);
        obstacles.add(row2);
        obstacles.add(row3);

        System.out.println("obstacles coordinate");
        for (List<Integer> list : obstacles) {
            for (Integer s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        System.out.println("result=> " + queensAttack(5, 9, 4, 3, obstacles));


    }
}