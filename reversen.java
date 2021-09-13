package com.company;

public class reversen {
    public static void main(String[] args) {
        int n=654321;
        while(n>0){
            int r=n%10;
            System.out.println(r+"");
            n=n/10;
        }
        int ans=0;
        int n1=654321;
        while (n1>0){
            int re=n1%10;
            n1=n1/10;
            ans=ans*10+re;



        }
        System.out.println(ans);

    }
}
