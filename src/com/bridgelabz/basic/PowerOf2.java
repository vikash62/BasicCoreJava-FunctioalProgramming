package com.bridgelabz.basic;

import java.util.Scanner;

public class PowerOf2 {
	 public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a number:");

	        int num=scanner.nextInt();

	        System.out.println("Power of 2^"+num+" is: "+(Math.pow(2, num)));
	        System.out.println();
	        System.out.println("Printing all till Power Value "+num);

	        for(int i=1;i<=num;i++)
	        {
	            System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));
	        }
	    }
}
