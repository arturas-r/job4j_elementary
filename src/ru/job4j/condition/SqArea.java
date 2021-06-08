package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p/(2*(k+1));
        // JDK указала что переменная L не используется, поэтому убрал её.
        double s = (h * k) * (p/(2*(k+1)));
        return s;
    }
    public static void main (String[] args){
        // ради эксперимента заменил данные цифры на другие
        double result = SqArea.square(9, 4.3);
        //перефразировал предложение и добавил знак \n раздела на новую линию
        System.out.println(" If perimeter - P = 9\nand lenghth more than height K = 4.3 times\nthen area of rectangle S = " + String.format("%.3f", result));
        /* конвертировал переменную result в String,
        что бы попробовать округлить результат до трёх знаков после запятой */
    }

}
