package classwork_day_16;

import java.util.Scanner;

public class Q3_5 {
	static {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int n = sc.nextInt();
		System.out.println("enter Seccond number");
		int n1 = sc.nextInt();
		System.out.println("enter third number");
		int n2 = sc.nextInt();
		System.out.println("enter four number");
		int n3 = sc.nextInt();
		if(n == n1 && n==n2 && n == n3) {
			System.out.println(n+", "+n1+", "+n2+", "+n3+" are equal");
		}else {
			System.out.println(n+", "+n1+", "+n2+", "+n3+" are not equal");
		}
	}
	public static void main(String[] args) {
		
	}
}
