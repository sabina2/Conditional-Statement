package com.Loading;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    int tempr;

    void tem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature there");
        int a=scanner.nextInt();
        if(a>40)
            System.out.println("Its very hot day");
        else if(a>30 && a<41)
            System.out.println("Its hot day");
        else if(a<31)
            System.out.println("Its nice day");
        else
            System.out.println("Its cold day");
    }

            public static void main(String[] args){
        Main m1=new Main();
        m1.tem();
            }
}
