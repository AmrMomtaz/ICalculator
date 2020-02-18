package Calculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTests {

	@Test
	void test1() 
	{
		Calculator calc = new Calculator();
		float out = calc.divide(10,2);
		assertEquals(5, out);
	}
	@Test
	void test2()
	{
		Calculator calc = new Calculator();
		float out = calc.divide(10,4);
		assertEquals(2.5, out);
	}
	@Test
	void test3()
	{
		Calculator calc = new Calculator();
		float out = calc.divide(10,3);
		assertEquals((float)10/3, out);
	}
	@Test
	public void whenDerivedExceptionThrown_thenAssertionSucceds() {
	    Exception exception = assertThrows(RuntimeException.class, () -> {
	        Integer.parseInt("1a");
	    });
	 
	    String expectedMessage = "For input string";
	    String actualMessage = exception.getMessage();
	 
	    assertTrue(actualMessage.contains(expectedMessage));
	}
}
