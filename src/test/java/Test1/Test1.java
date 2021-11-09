package Test1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Calculator.Calculator;

public class Test1 {

	@Test
	public void test_sum() {
		Calculator c1 = new Calculator();
		int actualResult = c1.sum(50, 2);
		int expectedResult = 52;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void test_Sub() {
		Calculator c = new Calculator();
		int actualResult = c.sub(50, 2);
		int expectedResult = 48;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void test_division() {
		Calculator c = new Calculator();
		int actualResult = c.div(50, 2);
		int expectedResult = 25;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void test_multiple() {
		Calculator c = new Calculator();
		int actualResult = c.mul(50, 2);
		int expectedResult = 100;
		assertEquals(expectedResult, actualResult);

	}

}
