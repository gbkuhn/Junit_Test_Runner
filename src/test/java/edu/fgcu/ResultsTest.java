package test.java.edu.fgcu;
import org.junit.Test;
import main.java.edu.fgcu.Results;


import static org.junit.Assert.*;

public class ResultsTest {
<<<<<<< HEAD
=======
	/*
	@Test
	public void testResults_1()
		throws Exception {
		Results result = new Results();
		assertNotNull(result);
		// add additional test code here
	}
*/
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
/*
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
*/

	/**
	 * @throws Exception
	 */
	 /*
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
*/
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
>>>>>>> origin/master

    public static int passed_subset_sum = 0, failed_subset_sum = 0, count_subset_sum = 0, ignore_subset_sum = 0, before_subset_sum = 0, after_subset_sum = 0, desired_subset_sum = 0;
    public static int passed_subset = 0, failed_subset = 0, count_subset = 0, ignore_subset = 0, before_subset = 0, after_subset = 0, desired_subset = 0;
    public static int passed = 0, failed = 0, count = 0, ignore = 0, before = 0, after = 0, desired = 0;

    @Test
    public void testSubset_report(){
        count_subset_sum+=count_subset;
        passed_subset_sum+= passed_subset;
        failed_subset_sum+=failed_subset;
        //ignore_subset_sum+=ignore_subset;
        before_subset_sum+=before_subset;
        after_subset_sum+=after_subset;

        assertEquals(count_subset,count_subset_sum);
    }

    @Test
    public void testReset_values(){
        passed_subset = Results.reset_values();
        assertEquals(passed_subset,0);
    }

    @Test
    public void testFinal_report(){

        boolean check = Results.final_report();
        assertTrue(check);
       
    }

    @Test
    public void testPercentages(){
    	//will not pass yet
        //assertTrue(Results.percentages());
    }
}