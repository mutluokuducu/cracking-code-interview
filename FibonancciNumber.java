package com.crackingcodeinterview;

import java.util.Scanner;

public class FibonancciNumber {
    public  void fibonancciNumbers(){
        System.out.println("///// Enter  number///////");
        Scanner n=new Scanner(System.in);
        int x= n.nextInt();
        System.out.println("///// Fibonancci numbers///////");
        for (int i = 0; i <x ; i++) {

            System.out.println(fibonancci(i));
        }
    }
    public static long fibonancci(int n){
        if (n == 0 ||n<=1 )  {
            return  n;

        }
        else{
            return fibonancci(n-1)+fibonancci(n-2);
        }

    }
}
