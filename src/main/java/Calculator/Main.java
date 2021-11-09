package Calculator;

public class Main {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		int sum = c1.sum(50, 2);
		System.out.println("addition of two number is:" + sum);

		Calculator c2 = new Calculator();
		int sub = c2.sub(50, 2);
		System.out.println("Substraction of two number is:" + sub);

		Calculator c3 = new Calculator();
		int mul = c3.mul(50, 2);
		System.out.println("multiplication of two number is:" + mul);

		Calculator c4 = new Calculator();
		int div = c4.div(50, 2);
		System.out.println("division of two number is:" + div);

	}

}
