package classwork_day_16;

import java.util.Scanner;

class Pizza{
	int size;
	int cheese;
	int pepperoni;
	int ham;
	public void calculate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of pizza \n 1.small\n 2.medium\n 3.large");
		size = sc.nextInt();
		System.out.println("enter the number of cheese topping");
		cheese = sc.nextInt();
		System.out.println("enter the number of pepperoni topping");
		pepperoni = sc.nextInt();
		System.out.println("enter the number of ham topping");
		ham = sc.nextInt();
		if(size == 1) {
			System.out.println("total pizza cost is : "+(299+(cheese*10)+(pepperoni*10)+(ham*10))+" rs");
		}else if(size == 2) {
			System.out.println("total pizza cost is : "+(499+(cheese*10)+(pepperoni*10)+(ham*10))+" rs");
		}else if(size == 3){
			System.out.println("total pizza cost is : "+(699+(cheese*10)+(pepperoni*10)+(ham*10))+" rs");
		}else {
			System.out.println("invalid size");
		}
	}
}
public class Q2_1 {
	public static void main(String[] args) {
		Pizza p = new Pizza();
		p.calculate();
	}
}
