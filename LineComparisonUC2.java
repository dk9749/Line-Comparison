package com.bridgelabz;

public class LineComparisonUC2 {

    public static void main(String[] args) {
        int x1, x2, x3, x4, y1, y2, y3, y4;
        double distance, distance1;
        x1 = 1;
        y1 = 1;
        x2 = 4;
        y2 = 4;
        x3 = 1;
        y3 = 1;
        x4 = 4;
        y4 = 4;

        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        distance1 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        if (distance == distance1) {
            System.out.println("Both Lines Are Equal");
        } else {
            System.out.println("Both Lines Are Not Equal");

        }
    }
}
