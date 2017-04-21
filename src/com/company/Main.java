package com.company;

public class Main {

    public static void main(String[] args) {
        RepeatingElement element = new RepeatingElement(1234567777);
        System.out.println(element.search(123));
        Account account=new Account(1000,100);
        System.out.println(account.calculateYears(2500));
       /* Account account=new Account(1000,100);
        System.out.println(account.calculateYears(1200));*/
/*
Calculator calculator=new Calculator(2,100,11111111,120,12,44,0,1111);
        System.out.println(calculator.getMax());
        System.out.println(calculator.getMin());
        System.out.println(calculator.getSum());
        System.out.println(calculator.getAverage());
        System.out.println(calculator.getExactAverage());
        System.out.println((double) (2+100+120+12+44+24+1111)/7);
*/
     /*   Printer printer = new Printer();
        printer.print();
        printer.reversePrint();
*/
    }
}
