package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short manHeight) {

        return ((manHeight - 100) * 1.15);
    }

    public static double womanWeight(short womanHeight) {

        return ((womanHeight - 110) * 1.15);
    }

    public static void main(String[] args) {

        short manHeight = 178;
        double man = Fit.manWeight(manHeight);
        System.out.println("Man 178 is " + man);

        /* Пробовал разные способы,
        что бы вес бы распечатывался цифрой
        с двумя децемелами и не более.
        Использовал вариант как в прошлом задании,
        когда переменную переводил в String

        System.out.println ("Man 178 is " + String.format("%2.f", man));

        но в этот раз ничего не получилось.
        Ума не приложу почему в прошлом задании этот метод работал,
        а в этом нет.  Разъясните пожалуйста.
         */

        short womanHeight = 165;
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Woman 165 is " + woman);

        /*  Ещё пробовал вариант с объявлением новой переменной,
            с последующим переводом её в String
            одновременно задавая параментр
            что бы вес бы распечатывался цифрой
            с двумя децемелами и не более.

            double woman = Fit.womanWeight(womanHeight);
            String idealWoman;
            idealWoman = String.format("%2.f", woman);
            System.out.println("Woman 165 is " + idealWoman);

            но и в этом случае тоже ничего не получилось.
            Разъясните пожалуйста, почему и этот метод не сработал.
         */
    }

   /* public static double manWeight (short height1) {
        return (float) ((height1 - 100) * 1.15);
    }
    public static float womanWeight (short height2) {
        return (float) ((height2 - 110) * 1.15);
    }
    public static void main (String[] args) {
        short height1 = 178;
        float man = Fit.manWeight(height1);
        System.out.println ("Man 178 is " + String.format("%2.d", man));
        short height2 = 165;
        float woman = Fit.womanWeight(height2);
        System.out.println("Woman 165 is " + String.format("%2.d", woman));
    }*/

}
