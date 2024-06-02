package mathsquiz;

import java.util.Random;
import java.util.Scanner;

public class Ask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Random r1 = new Random();
		while (true) {
			int n1 = r1.nextInt(100);
			int n2 = r1.nextInt(100);
			System.out.println("what is " + n1 + " + " + n2);
			String s = scanner.nextLine();
			if (s.equals("exit")) {
				System.out.println("bye bye !!!");
				scanner.close();
				break;
			} else if (n1 + n2 == Integer.parseInt(s)) {
				System.out.println("correct !!!");
			} else {
				System.out.println("wrong !!!");

			}
		}
	}
}
