package classwork_day_16;

class Degree{
	public void getDegree() {
		System.out.println("I got a degree");
	}
}
class Undergraduate{
	public void getDegree() {
		System.out.println("I got a Undergraduate degree");
	}
}
class Postgraduate{
	public void getDegree() {
		System.out.println("I got a Postgraduate degree");
	}
}
public class Q1_1 {
	public static void main(String[] args) {
		Degree d = new Degree();
		Undergraduate u = new Undergraduate();
		Postgraduate p = new Postgraduate();
		d.getDegree();
		u.getDegree();
		p.getDegree();
	}
}
