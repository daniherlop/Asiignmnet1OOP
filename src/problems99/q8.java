package problems99;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.print ("please give me a number :");
		double num = kb.nextDouble();
		if(num < 0) {
			System.out.print("I cant do it");
		}else {
			double sqrootnum = Math.sqrt(num);
			System.out.print("the sqr is " + sqrootnum);
					
		}
		

	}

}
