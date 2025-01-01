package classwork_day_16;

public class Q4 {
	public static void main(String[] args) {
		String s = "HELLO$WORLD";
		String s1[] = s.split("\\$");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
	}
}
