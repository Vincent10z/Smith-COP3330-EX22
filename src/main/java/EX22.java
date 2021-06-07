/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */


import java.util.Scanner;

public class EX22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter the first number: ");
        a  = input.nextInt();
        System.out.print("Enter the second number: ");
        b  = input.nextInt();
        System.out.print("Enter the third number: ");
        c  = input.nextInt();

        if (a >= b && a >=c)
            System.out.print(+a+" is the largest number");
        if (b >= a && b >=c)
            System.out.print(+b+" is the largest number");
        if (c >= a && c >=b)
            System.out.print(+c+" is the largest number");





    }
}
