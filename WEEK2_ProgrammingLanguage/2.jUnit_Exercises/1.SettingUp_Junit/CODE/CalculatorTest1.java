package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest1 {
	 @Test
	    public void testAdd() {
	        Calculator calc = new Calculator();
	        int result = calc.add(2, 3);
	        assertEquals(5, result);  // Test will pass if result is 5
	    }
}
