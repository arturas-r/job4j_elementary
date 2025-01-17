package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        // Idea указала что переменная L не используется, поэтому убрал её.
        // return (h * k * h);
        return (Math.pow(h, 2) * k);
    }

    public static void main(String[] args) {
        // ради эксперимента заменил данные цифры на другие
        double result = SqArea.square(6, 2);
        //перефразировал предложение и добавил знак \n раздела на новую линию
        System.out.println(" If perimeter P = 6\nand lenghth more than height K = 2 times\nthen area of rectangle S = " + String.format("%.3f", result));
        /* конвертировал переменную result в String,
        что бы попробовать округлить результат до трёх знаков после запятой */
    }

}