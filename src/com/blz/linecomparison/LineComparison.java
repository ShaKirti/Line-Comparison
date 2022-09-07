package com.blz.linecomparison;

import java.util.Objects;

public class LineComparison {
    public static void main(String args[]){
        System.out.println("Welcome to Line Comparison Computation Program");

        // Point 1
        int x1 = 15;
        int y1 = 2;

        // Point 2
        int x2 = 17;
        int y2 = 13;

        // Point 3
        int x3 = 18;
        int y3 = 6;

        // point 4
        int x4 = 20;
        int y4 = 17;

        double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println(length1);
        double length2 = Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
        System.out.println(length2);

        if (Objects.equals(length1, length2)) {
            System.out.println("Both lines are of same length.");
        } else
            System.out.println("Both lines are of different length.");
    }
}
