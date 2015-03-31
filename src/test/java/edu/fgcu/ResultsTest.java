package test.java.edu.fgcu;

import main.java.edu.fgcu.Results;

import org.junit.*;

import static org.junit.Assert.*;

public class ResultsTest {
	
	@Test
	public void testResults_1()
		throws Exception {
		Results result = new Results();
		assertNotNull(result);
		// add additional test code here
	}

	@Test
	public void testFinal_report_1()
		throws Exception {

		boolean result = Results.final_report();

		// add additional test code here
		assertEquals(true, result);
	}
	
	@Test
	public void testFinal_report_2()
		throws Exception {

		boolean result = Results.final_report();

		// add additional test code here
		assertEquals(true, result);
	}

	@Test
	public void testPercentages_1()
		throws Exception {

		boolean result = Results.percentages();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArithmeticException: / by zero
		//       at main.java.edu.fgcu.Results.percentages(Results.java:53)
		assertTrue(result);
	}

	@Test
	public void testPercentages_2()
		throws Exception {

		boolean result = Results.percentages();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArithmeticException: / by zero
		//       at main.java.edu.fgcu.Results.percentages(Results.java:53)
		assertTrue(result);
	}

	@Test
	public void testPercentages_3()
		throws Exception {

		boolean result = Results.percentages();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArithmeticException: / by zero
		//       at main.java.edu.fgcu.Results.percentages(Results.java:53)
		assertTrue(result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testPercentages_4()
		throws Exception {

		boolean result = Results.percentages();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArithmeticException: / by zero
		//       at main.java.edu.fgcu.Results.percentages(Results.java:53)
		assertTrue(result);
	}

	@Test
	public void testReset_values_1()
		throws Exception {

		int result = Results.reset_values();

		// add additional test code here
		assertEquals(0, result);
	}

	@Test
	public void testSubset_report_1()
		throws Exception {

		Results.subset_report();

		// add additional test code here
	}

	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ResultsTest.class);
	}
}