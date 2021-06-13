package ru.job4j.converter;

public class Converter {

    // old code
    /* public static float rubleToEuro(float value) {
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
    } */

    // new testing code
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        // ради эксперимента заменил 140 руб на int rubles
        // изменил программку так что надо ввести переменную rubles % 7 && 6 = 0  один раз и всё вроде должно работать
        int rubles = 1260;
        int euro = Converter.rubleToEuro(rubles);
        System.out.println(rubles + " rubles equal " + euro +  " euros.");

        int inEuro = rubles;
        int expectedEuro = euro;
        int outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println(inEuro + " rubles equal " + expectedEuro + ". Test result : " + passedEuro);

        int dollar = Converter.rubleToDollar(rubles);
        System.out.println(rubles + " rubles equal " + dollar + " dollars.");

        int inDollar = rubles;
        int expectedDollar = dollar;
        int outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println(inDollar + " rubles equal " + expectedDollar + ". Test result : " + passedDollar);
    }
}
