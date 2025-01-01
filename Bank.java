package classwork_day_16;

//method overridding
class SBI{
	public void getRateOfInterest() {
		System.out.println("rate of intrest of sbi is 10%");
	}
}
class ICICI{
	public void getRateOfInterest() {
		System.out.println("rate of intrest of icici is 11%");
	}
}
class HDFC{
	public void getRateOfInterest() {
		System.out.println("rate of intrest of HDFC is 9%");
	}
}
class AXIS{
	public void getRateOfInterest() {
		System.out.println("rate of intrest of axis is 12%");
	}
}
public class Bank {
	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		HDFC h = new HDFC();
		AXIS a = new AXIS();
		s.getRateOfInterest();
		i.getRateOfInterest();
		h.getRateOfInterest();
		a.getRateOfInterest();
	}
}
