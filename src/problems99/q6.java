package problems99;

import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner kb= new Scanner (System.in);
	System.out.print("please give me a number1:");
	double num1 = kb.nextDouble();
	System.out.print("please give me a number2:");
	double num2 = kb.nextDouble();
	System.out.println("the first num is" + num1);
	System.out.println("the second num is" + num2);
	System.out.println ("Now swap it");

	double temp;
	temp = num1;
	num1 = num2;
	num2 = temp;
	
	System.out.println("the first num is " + num1);
	System.out.println("the second num is" + num2);


}
}
