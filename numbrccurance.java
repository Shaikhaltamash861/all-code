package com.company;

public class numbrccurance {
    public static void main(String[] args) {
        int n=1385757879;
        int c=1;
        int cnt=0;
        while (n>0){
            int s=n%10;
            if (s==c){
                cnt++;


            }
            n=n/10;
        }
        System.out.println(cnt);
    }
}
