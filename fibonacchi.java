package com.company;

import java.util.Scanner;

public class fibonacchi {
    public static void main(String[] args) {
        System.out.println("enter the range of series");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        int a=0;
        int b=1;
        int r=0;
        int s=0;
        while (n>1){

            s+=a;

            r=a+b;
            a=b;
            b=r;
            n--;

        }

        System.out.println("the nth no is :"+b);

    }
}
