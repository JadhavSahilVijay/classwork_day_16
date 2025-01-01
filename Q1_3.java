package classwork_day_16;

class Demo {
	private String name;
	private int age;
	private String Department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String Department) {
		this.Department = Department;
	}
}
public class Q1_3 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.setName("sahil");
		d.setAge(20);
		d.setDepartment("web");
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getDepartment());
	}
}
