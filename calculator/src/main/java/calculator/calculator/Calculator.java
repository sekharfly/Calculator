package calculator.calculator;

/**
 * @author sekharv
 *
 */
public class Calculator {
	int sum, sub;

	public void add(int a, int b) {
		sum = a + b;
		System.out.println(sum);
	}

	public void sub(int a, int b) {
		sub = a - b;
		System.out.println(sub);
	}

}
