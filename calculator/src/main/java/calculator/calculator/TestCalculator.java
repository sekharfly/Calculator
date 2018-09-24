package calculator.calculator;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator calculatorExample = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enater the A values");
		int a = 0, b = 0;
		;
		try {
			a = scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("enater the B values");
		try {
			b = scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		calculatorExample.add(a, b);
		calculatorExample.sub(a, b);
	}

}
