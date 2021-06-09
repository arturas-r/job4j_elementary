package ru.job4j.condition;

public class Greeting {
    public static void main (String[] args){
        String idea = "I like Java!";
        System.out.println(idea + " " + "But I am newbie.");
        int year = 2021;
        /* Погуглив, я понял что просто так присвоить
         новое значение для переменной типа String невозможно,
         поэтому объявляю новую переменную типа String
         и завершаю задачу. В обоих случаях,
         вывода информации в консоль, добавил пробелы,
         что бы смотрелось лучше.*/
        String newIdea = idea + " " + year;
        System.out.println(newIdea);
    }
}
