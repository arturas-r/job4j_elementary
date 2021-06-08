package ru.job4j.condition;

public class TrgArea {
    public static double area (double a, double b, double c){
        double P = (a + b + c)/2;
        return Math.sqrt(P * (P + a) * (P + b) * (P + c));
    }
    public static void main (String[] args){
        double result = TrgArea.area (3, 4, 5);
        System.out.print("The area of the triangle where\nside a = 3, side b = 4, side c = 5\nequals to "  + String.format("%.5f", result));
    }
}
