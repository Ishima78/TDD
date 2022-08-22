package org.example;

public class CalculatorCredit {

    public int mounthPayment ( int cash , int mounth){
        int result = cash/mounth;
        return result;
    }

    public double totalCredit (double procent , int amouthCredit){
        double overpayment = (amouthCredit*procent)/100;
        double result = amouthCredit+overpayment;
        return result;
    }
    public double overpaymentsForTheEntirePeriod( double procentofCredit,int amouthCredit){
        double valueOfCredit =  ((amouthCredit*procentofCredit)/100)+amouthCredit;
        double result = valueOfCredit-amouthCredit;
        return result;
    }
}
