package com.blz.linecomparison;

public class LineComparison {
    public static void main(String args[]){
        System.out.println("Welcome to Line Comparison Computation Program");

        // Point 1
        int x1 = 15;
        int y1 = 2;

        // Point 2
        int x2 = 17;
        int y2 = 13;

        double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println(length);
    }
}
