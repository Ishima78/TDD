package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CalculatorCredit c = new CalculatorCredit();
        System.out.println("Ваша переплата "+
                c.overpaymentsForTheEntirePeriod(3,100)+ " рубля ");
    }
}