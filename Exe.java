import java.util.Scanner;

public class Exe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);

		int y;
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);

		double z;
		z = sc.nextDouble();
		System.out.printf("Voce digitou: %.2f%n", z);

		char c;
		c = sc.next().charAt(0);
		System.out.println("Voce digitou: " + c);
		
		String a;
		int b;
		double d;
		a = sc.next();
		b = sc.nextInt();
		d = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		

		sc.close();
	}
}