package classwork_day_16;

class PrintArea{
	public void print(int a) {
		System.out.println("area os square is : "+Math.pow(a, 2));
	}
	public void print(int l, int w) {
		System.out.println("area os square is : "+(l+w));
	}
}
public class Q3_2 {
	
	public static void main(String[] args) {
		PrintArea p = new PrintArea();
		p.print(10);
		p.print(10, 20);
	}
}
