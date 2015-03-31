package test.java.edu.fgcu;

import main.java.edu.fgcu.Analyze;
import main.java.edu.fgcu.Test_class;

import org.junit.*;

import static org.junit.Assert.*;

public class AnalyzeTest {

	@Test
	public void testAnalyze_1()
		throws Exception {

		boolean result = Analyze.analyze();

		// add additional test code here
		assertEquals(true, result);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDetermine_1()
		throws Exception {

		boolean result = Analyze.determine();

		// add additional test code here
		assertTrue(result);
	}


	@Test
	public void testDisplay_info_1()
		throws Exception {
		Class obj = Object.class;

		Analyze.display_info(obj);

		// add additional test code here
	}

	@Test
	public void testDisplay_info_2()
		throws Exception {
		Class obj = Object.class;

		Analyze.display_info(obj);

		// add additional test code here
	}


	@Test
	public void testDisplay_info_3()
		throws Exception {
		Class obj = Object.class;

		Analyze.display_info(obj);

		// add additional test code here
	}


	@Test
	public void testDisplay_info_4()
		throws Exception {
		Class obj = Object.class;

		Analyze.display_info(obj);

		// add additional test code here
	}

	@Test
	public void testGet_failed_1()
		throws Exception {

		int result = Analyze.get_failed();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testGet_failed_subset_1()
		throws Exception {

		int result = Analyze.get_failed_subset();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testGet_passed_1()
		throws Exception {

		int result = Analyze.get_passed();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testGet_passed_subset_1()
		throws Exception {

		int result = Analyze.get_passed_subset();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testNum_of_desired_1()
		throws Exception {
		Class<Test_class> obj = Test_class.class;

		int result = Analyze.num_of_desired(obj);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testNum_of_desired_2()
		throws Exception {
		Class<Test_class> obj = Test_class.class;

		int result = Analyze.num_of_desired(obj);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testNum_of_desired_3()
		throws Exception {
		Class<Test_class> obj = Test_class.class;

		int result = Analyze.num_of_desired(obj);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testNum_of_desired_4()
		throws Exception {
		Class<Test_class> obj = Test_class.class;

		int result = Analyze.num_of_desired(obj);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testNum_of_tests_1()
		throws Exception {
		Class<Test_class> obj = Test_class.class;

		int result = Analyze.num_of_tests(obj);

		// add additional test code here
		assertEquals(6, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testNum_of_tests_2()
		throws Exception {
		Class<Test_class> obj = Test_class.class;

		int result = Analyze.num_of_tests(obj);

		// add additional test code here
		assertEquals(6, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testNum_of_tests_3()
		throws Exception {
		Class<Test_class> obj = Test_class.class;

		int result = Analyze.num_of_tests(obj);

		// add additional test code here
		assertEquals(6, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testNum_of_tests_4()
		throws Exception {
		Class<Test_class> obj = Test_class.class;

		int result = Analyze.num_of_tests(obj);

		// add additional test code here
		assertEquals(6, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testNum_of_tests_5()
		throws Exception {
		Class<Test_class> obj = Test_class.class;

		int result = Analyze.num_of_tests(obj);

		// add additional test code here
		assertEquals(6, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testNum_of_tests_6()
		throws Exception {
		Class<Test_class> obj = Test_class.class;

		int result = Analyze.num_of_tests(obj);

		// add additional test code here
		assertEquals(6, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testNum_of_tests_7()
		throws Exception {
		Class<Test_class> obj = Test_class.class;

		int result = Analyze.num_of_tests(obj);

		// add additional test code here
		assertEquals(6, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testSet_passed_1()
		throws Exception {
		int passed_buf = 1;

		Analyze.set_passed(passed_buf);

		// add additional test code here
	}

	/**
	 * @throws Exception
	 *         if the initialization fails for some reason
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AnalyzeTest.class);
	}
}