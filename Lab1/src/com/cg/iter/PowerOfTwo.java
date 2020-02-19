package com.cg.iter;

import java.util.Scanner;

public class PowerOfTwo {
	static boolean checkNumber(int n) {
		if ((n&(n-1)) == 0&&n!=0){
			System.out.println("True");
			return true;
		}
		else{
			System.out.println("false ");
		return false;
		}
	}

	public static void main(String[] args) {
		checkNumber(5);
		
		
	}

}
