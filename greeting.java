package com.company;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
        System.out.println("enter two numbers or press c for cheak indian eupees to d :");
        int inr= n.nextInt();
        int a= n.nextInt();

        int b= n.nextInt();
        System.out.println("enter operation");
        char q=n.next().trim().charAt(0);
        int t=0;

            int r = 0;
            if (q == '+') {
                r = a + b;

            }
            if (q == '-') {
                r = a - b;

            }
            if (q == '/') {
                r = a / b;
            }
            if (q=='c'){
                r=inr/75;
            }
            System.out.println("Your result is  :" + r);




    }
}
