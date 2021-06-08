package ru.job4j.condition;

public class Point {
    public static double distance (int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double d1 = Math.pow(x, 2);
        double d2 = Math.pow(y, 2);
        /*  double rsl = -1;
            return rsl;
            можно выразить одной строчкой,
            как указано ниже */
        return Math.sqrt(d1 + d2);
    }
    public static void main (String[] args) {
        // ради эксперимента заменил данные координат на другие
        double result = Point.distance(5, 4, 8, 7);
        // конвертировал переменную result в String,
        // что бы попробовать округлить результат до четырёх знаков после запятой
        System.out.println("distance from (5, 4) to (8, 7) = " + String.format("%.4f", result));
    }
}