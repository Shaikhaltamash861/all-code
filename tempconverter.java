package com.company;

import java.util.Scanner;

public class tempconverter {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("For celcius t farenheit enter cf");
        String a=n.next();
        String c="cf";
        System.out.println(a==c);
        if(a==c) {

            System.out.println("please enter temperature in celcius");
            float tc = n.nextFloat();
            float tf = (tc * 9 / 5) + 32;
            System.out.println("the temperature is in farenheit is :" + tf);
        }
        else {
            System.out.println("please enter temperature in  farenheit"+a +c);
            float tc = n.nextFloat();
            float tf = (tc * 9 / 5) + 32;
            System.out.println("the temperature is in celcius is :" + tf);

        }
    }
}
