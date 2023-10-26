package problems99;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.print("please give me a number:");
		int num = kb.nextInt();
		if (num % 2 == 0 ) {
			System.out.print("Number is even");
		}else {
			System.out.print("Number is Odd");
		}
		kb.close();
		

	}

}
