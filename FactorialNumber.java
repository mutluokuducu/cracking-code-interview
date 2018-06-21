package com.crackingcodeinterview;

public class FactorialNumber {
    public void FactorialNumbers(int n){
        int sum=1;

        if(n==0)  sum=1;

        for (int i = 1; i <=n ; i++) {

            sum*=i;
        }

        System.out.println(sum + " : factorial number");
    }
}
