package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        //заменил int на float,
        // для того что бы программка показывала дробные числа
        return value / 70;
        //IDEA указала, что переменная rsl лишняя
    }

    public static float rubleToDollar(float value) {
        return value / 60;
        //IDEA указала, что переменная rsl лишняя
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(440);
        System.out.println("440 rubles equal " + String.format("%.2f", euro) +  " euros.");
        // нагуглил что самый простой способ отобразить float в виде десятичной дроби,
        // будет используя перевод велечины в String и добавлением знака %.2f
        float dollar = Converter.rubleToDollar(440);
        // ради полноты эксперимента заменил 140 руб на 440
        System.out.println("440 rubles equal " + String.format("%.2f", dollar) + " dollars.");
    }
}
