package com.burger;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner enter=new Scanner(System.in);
        List<Burger> bgList=new ArrayList<>();
        bgList.add(new Burger("1-Simple Burger","Optional",1.5));
        bgList.add(new Burger("2-Healtly Burger","Black Bread",2.5));
        bgList.add(new Burger("3-Father Burger","Optional Bread",3.5));

        System.out.println("Base Prices:");
        for (Burger item:bgList) {

            System.out.println("Name: "+item.getName()+" Price: "+ item.getPrice()+" Bread Type : "+item.getBreadType());
        }

        List<Exstra> exList=new ArrayList<>();

        exList.add(new Exstra("1-dometo:",2.1));
        exList.add(new Exstra("2-mayones:",3.1));
        exList.add(new Exstra("3-sos:",1.3));
        exList.add(new Exstra("4-ketcup:",0.1));
        exList.add(new Exstra("5-chips:",3.1));
        exList.add(new Exstra("6-cocola:",1.1));

        System.out.println("*******************************************");
        System.out.println("Exsra List & Prices:");
        for (Exstra item:exList) {

            System.out.println("Name: "+item.getName()+" Price:"+ item.getPrice());
        }

        System.out.println("////////////////////////////////");
        System.out.println("Enter Burger Type:");
        Integer i=enter.nextInt();
        System.out.println("////////////////////////////////");

        double totalEx=0;
        if (i ==1) {
            System.out.println("Enter exsra Max 4  :");

            for (int j = 1; j <5 ; j++) {
                int y = enter.nextInt();
                if (y==0) {
                    break;
                }
                    System.out.println(y + " selected");
                    totalEx += exList.get(y - 1).exTotalPrice();
                    System.out.println("Total Exsra:"+totalEx);

            }
            System.out.println("TOTAL: "+(double)(bgList.get(i-1).getPrice()+totalEx));

        }else if (i==2){
            System.out.println("Enter exsra Max 6 :");

            for (int j = 1; j <7 ; j++) {
                Integer x=enter.nextInt();
                if (x==0) {
                    break;
                }
                System.out.println(x+" selected");
                totalEx+=exList.get(x-1).exTotalPrice();
                System.out.println("Total Exsra:"+totalEx);
            }
            System.out.println("TOTAL: "+(double)(bgList.get(i-1).getPrice()+totalEx));
        }else {
            System.out.println("Include Cocole and cips ");
            System.out.println("TOTAL:"+bgList.get(i-1).getPrice()+exList.get(5).getPrice()+exList.get(6).getPrice());
        }



    }
}
