package com.company;

/**
 * Created by Oleg on 20.04.2017.
 */
public class Account {
    private double amount;
    private double percent;

    public Account(int amount, int percent) {
        this.amount = amount;
        this.percent = percent;
    }

    public double calculateYears(int a) {
        double result = amount;
        double year = 0;
        double perYear = (amount * percent) / 100;
        while (result != a) {
            result += perYear;
            if (result > a) {
                double temp = result - a;
                temp = temp / perYear;
                year += temp;
                break;//return year;
            }
            year++;
        }
    /*  label:
        for(double total=amount;total!=a;year++){
            total+=perYear;
            if (total>a){
                double temp = total - a;
                temp = temp / perYear;
                year += temp;
                break label;
            }

        }*/
        // double result = (a - amount) / perYear;
        return year;
    }
}
