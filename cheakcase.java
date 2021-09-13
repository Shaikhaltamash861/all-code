package com.company;

import java.util.Scanner;

public class cheakcase {
    public static void main(String[] args) {
        System.out.println("Please enter the charecter");
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
        System.out.println(ch);
        if(ch>='a' && ch<='z'){
            System.out.println(" charecter is lowercase");


        }
        else {
            System.out.println(" charecter is uppercase ");
        }
    }
}
