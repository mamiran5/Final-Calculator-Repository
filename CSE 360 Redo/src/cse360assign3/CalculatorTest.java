package cse360assign3;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams()
	{
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	
	@After
	public void cleanUpStreams()
	{
	    System.setOut(null);
	    System.setErr(null);
	}
	
	@Test
	public void test()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testCalculator() 
	{
		
		Calculator calc = new Calculator();
		
		assertNotNull("The object is null", calc);
	}
	
	@Test
	public void testGetTotal()
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.multiply(2);
		
		assertEquals(10, calc.getTotal());
	}
	
	@Test
	public void testAdd()
	{
		Calculator calc = new Calculator();
		calc.add(7);
		
		assertEquals(7, calc.getTotal());
	}
	
	@Test
	public void testSubtract()
	{
		Calculator calc = new Calculator();
		calc.subtract(10);
		
		assertEquals(-10, calc.getTotal());
	}

	@Test
	public void testMultiply()
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.multiply(8);
		
		assertEquals(40, calc.getTotal());
	}
	
	@Test
	public void testDivide()
	{
		Calculator calc = new Calculator();
		calc.add(16);
		calc.divide(2);
		
		assertEquals(8, calc.getTotal());
	}
	
	@Test
	public void testDivideByZero()
	{
		Calculator calc = new Calculator();
		calc.add(16);
		calc.divide(0);
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testGetHistory()
	{
		fail("Not yet implemented");
	}
}
