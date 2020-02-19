 package com.cg.iter;

import java.util.Scanner;

public class IncreasingNumber {
	public static boolean checkNumber()
	{
		int num;
		boolean Number=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		int lastDigit=9;
		
		while(num>0)
			
		{
			int currentNumb=num%10;
			num=num/10;
			if (currentNumb>lastDigit)
			{
				Number=false;
				break;
			}
			lastDigit=currentNumb;
			
		}
		
		return Number;
		
		
	}

	public static void main(String[] args) {
		checkNumber();

	}

}
