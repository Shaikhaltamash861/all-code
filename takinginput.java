package com.company;

import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        int v=5;

        do {
            System.out.println("enter x to exit ");
             ch=input.next().trim().charAt(0);



        }
        while (ch!='x');



    }
}
