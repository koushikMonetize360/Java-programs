package com.monetize360.cj.basics;

import java.util.Scanner;
//problem num 40
public class SpecialPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        int t=1;
        for(int i=rows;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(t +" ");
                t++;
            }
            System.out.println();
        }

    }
}
