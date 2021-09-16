package com.bridgelabz;

public class LineComparisonUsingMethods {
    static int x1 = 1, x2 = 3, x3 = 1, x4 = 4, y1 = 1, y2 = 3, y3 = 1, y4 = 4;
    static double distance, distance1;

    public static void main(String[] args) {
        compareBothLines();
    }

    public static void compareBothLines() {
        line1Length();
        line2Length();
        if (distance == distance1) {
            System.out.println("Both Lines Are Equal");
        } else if (distance > distance1) {
            System.out.println("Line One Is Greater Than Line Two");
        } else {
            System.out.println("Line One Is Less Than Line Two");
        }
    }

    public static double line1Length() {
        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distance;
    }

    public static double line2Length() {
        distance1 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        return distance1;
    }
}
