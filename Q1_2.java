package classwork_day_16;

public class Q1_2 {
	public void Myname() {
		System.out.println("my name is sahil");
	}
	public void Myname(String name) {
		System.out.println("my name is "+name);
	}
	public static void main(String[] args) {
		Q1_2 q = new Q1_2();
		q.Myname();
		q.Myname("Sahil");
	}
}
