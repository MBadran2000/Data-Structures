import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		
		assertEquals(50,calculator.add(30,20));
		assertEquals(-10,calculator.add(-30,20));
		assertEquals(600,calculator.add(300,300));
		assertEquals(0,calculator.add(-2050,2050));
		assertEquals(-100,calculator.add(-300,200));
		assertEquals(300200,calculator.add(300000,200));
		assertEquals(0,calculator.add(-0,0));
		

	}
	
	@Test
	void testDivide() {
		Calculator calculator = new Calculator();
		
		assertEquals(1,calculator.divide(20,20));
		assertEquals(-1,calculator.divide(-100,100));
		assertEquals(-1,calculator.divide(3020,-3020));
		assertEquals((float)1/3,calculator.divide(1,3));
		assertEquals((float)-5/9,calculator.divide(-5,9));
		assertEquals((float)-40,calculator.divide(-4000,100));
		assertEquals(0,calculator.divide(0,5520));
		assertEquals(0,calculator.divide(0,-5520));
		Assertions.assertThrows(RuntimeException.class, ()->calculator.divide(544,0));
		Assertions.assertThrows(RuntimeException.class, ()->calculator.divide(0,0));

	}
}