package com.crackingcodeinterview;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public void Armstrong(int number) {
        int fistNum=number;
        int rem;
        int n = 0;
        int result = 0;
        List<Integer> numbers = new ArrayList<>();
        if (number < 0) return;

        while (number > 0) {
            rem = number % 10;
            number = (int) (number / 10);
            numbers.add(rem);

        }
        for (int d : numbers) {
            result += (d * d * d);

        }
        if (result == fistNum) {

            System.out.println(fistNum + " :Armstrong number");

        } else {
            System.out.println(fistNum + " :not Armstrong number");

        }
    }


}
