public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, Dundee!!");
		int num = Integer.parseInt(args[0]);
		int res = 1;
		for (int i = 1; i <= num; i++) {
			res *= i;
		}
		System.out.println(num + "! = " + res);
	}
}