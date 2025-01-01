package classwork_day_16;

import java.util.Scanner;

public class Q1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		if(n%5==0) {
			System.out.println(n+" is divisible by 5");
			if(n%11==0) {
				System.out.println(n+" is divisible by 11");
			}
		}else {
			System.out.println(n+" is not divisible by 5 and 11");
		}
	}
}
