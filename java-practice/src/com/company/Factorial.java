package com.company;

import java.util.Scanner;


public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: " );
        int a = sc.nextInt();
        System.out.println("Factorial of a "+  fact(a));
//        int s=fact(a);
//        System.out.println(s);
        Factorial f = new Factorial();
    }
    static {
        System.out.println("This is static block...");
    }
    {
        System.out.println("This is a non-static block...");
    }
     static int fact (int a){
        if (a == 0 || a==1)
            return 1;

        return a*fact(a-1);
    }
}
