package com.company;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg on 20.04.2017.
 */
public class RepeatingElement {
    private int temp;
    private List<Integer> integerList = new ArrayList<>();

    public RepeatingElement(int v) {
        while (v  > 0) {
            temp = v  % 10;
            v/=10;
            integerList.add(temp);
        }
    }

    public int search(int s) {
        int result = 0;
        for (Integer integer : integerList) {
            if (s == integer) {
                result++;
            }
        }
        return result;
    }

}
