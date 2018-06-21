package com.crackingcodeinterview;

public class PalindromeNumber {
    public  void  Palindrome(int x){

        int n=x > 0?x:x*-1;
        int number=n;
        int remainder;
        int result=0;

        while (number>0){
            remainder =number%10;
            number=(int)(number/10);
            result=result*10+remainder;

        }

        if (result==n) {

            System.out.println(x+" :palindrome number");

        }else
        {
            System.out.println(x+" :not palindrome number");

        }
    }
}
