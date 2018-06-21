package com.crackingcodeinterview;

public class PrimeNumbers {
    public int[] prime = {2, 3, 5, 11, 13, 17, 19, 23, 29};

    public void FindPrimeNumber(int number) {
        boolean primeTest=false;

        for (int item : prime) {
            if ((number % number) == 0 || ((number % item) == 0)) {

                primeTest = true;

            }
        }
        if (primeTest == true) {
            System.out.println( number + ": prime number");

        }else
        {
            System.out.println(number + " : prime number");
        }


    }
}
