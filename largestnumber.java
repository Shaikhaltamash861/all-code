package com.company;

import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b=input.nextInt();

        int c=input.nextInt();
        int gr=a;

        if (b>gr) {
            gr=b;

        }
        if (c>gr){
            gr=c;
        }
        System.out.println(gr);
    }
}
