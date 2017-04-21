package com.company;

/**
 * Created by Oleg on 19.04.2017.
 */
public class Calculator {
    private int[] v;

    Calculator(int... v) {
        this.v = v;
    }

    public int getSum() {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }

    public int getMax() {
        int max = v[0];
        for (int i = 1; i < v.length; i++) {
            max = max < v[i] ? v[i] : max;
        }

        return max;
    }

    public int getMin() {
        int min = v[0];
        for (int i = 1; i < v.length; i++) {
            if (min > v[i]) {
                min = v[i];
            }

        }
        return min;
    }

    public int getAverage() {
        int mid = getSum() / v.length;
        return mid;
    }

    public double getExactAverage() {
        double mid = getSum();
        return mid / v.length;
    }

}
