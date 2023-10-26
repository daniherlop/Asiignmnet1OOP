package problems99;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.print ("Please give me a number1: ");
		double num1 = kb.nextDouble();
		System.out.print("Please give me a number2: ");
		double num2 = kb.nextDouble();
		System.out.print("Please give me a number3: ");
		double num3 = kb.nextDouble();
		
		double avg = (num1 + num2 + num3)/3; 
		
		System.out.print("the avg of 3 num:" + avg);
		kb.close();

	}

}
