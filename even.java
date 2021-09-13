package com.company;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("enter to cheak even and odd");
        int n=t.nextInt();
        if (n%2==0){
            System.out.println("n is even :"+n);

        }
        else {
            System.out.println("n is odd :"+n);
        }
    }
}
