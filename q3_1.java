package classwork_day_16;

public class q3_1 {
	public void printn(int n) {
		System.out.println(n);
	}
	public void printn(float n) {
		System.out.println(n);
	}
	public void printn(double n) {
		System.out.println(n);
	}
	public void printn(long n) {
		System.out.println(n);
	}
	public static void main(String[] args) {
		q3_1 q = new q3_1();
		q.printn(10);
		q.printn(10.1);
		q.printn(10.1);
		q.printn(1000000000);
	}
}
