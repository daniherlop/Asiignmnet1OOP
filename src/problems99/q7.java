package problems99;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner (System.in);
		System.out.print("please give me a number:");
		int num = kb.nextInt();
		boolean isprime = true;
		if (num<1) {
			isprime = false;
		}
		for (int i = 2; i <= num/ 2; i++) {
			if ((num%i)== 0) {
				isprime= false;
			}
		}
		if (isprime) {
			System.out.print("your num is prime");
		} else {
			System.out.print("you number is not prime");
		
		}
		

	}

}
