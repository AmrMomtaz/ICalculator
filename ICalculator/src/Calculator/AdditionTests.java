package Calculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTests {

	@Test
	void test1() 
	{
		Calculator calc = new Calculator();
		int out = calc.add(5, 0);
		assertEquals(5, out);
	}
	@Test
	void test2()
	{
		Calculator calc = new Calculator();
		int out = calc.add(0, 0);
		assertEquals(0, out);
	}
	@Test
	void test3()
	{
		Calculator calc = new Calculator();
		int out = calc.add(50, 50);
		assertEquals(100, out);
	}
}
