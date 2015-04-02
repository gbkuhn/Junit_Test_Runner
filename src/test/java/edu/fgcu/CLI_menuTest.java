package test.java.edu.fgcu;

import main.java.edu.fgcu.CLI_menu;
import main.java.edu.fgcu.Test_class;

import org.junit.*;

import static org.junit.Assert.*;

public class CLI_menuTest {

	@Test(expected = java.lang.RuntimeException.class)
	public void testExit_1()
		throws Exception {

		CLI_menu.exit();

		// add additional test code here
	}


	@Test
	public void testMenu_1()
		throws Exception {

		int result = CLI_menu.menu();

		// add additional test code here
		assertEquals(2, result);
	}

	@Test
	public void testMenu_subset_1()
		throws Exception {
		Class<Test_class> obj = Test_class.class;
		int total_num_tests = 1;

		int result = CLI_menu.menu_subset(obj, total_num_tests);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException
		//       at java.util.Scanner.throwFor(Scanner.java:862)
		//       at java.util.Scanner.next(Scanner.java:1485)
		//       at java.util.Scanner.nextInt(Scanner.java:2117)
		//       at java.util.Scanner.nextInt(Scanner.java:2076)
		//       at main.java.edu.fgcu.CLI_menu.menu_subset(CLI_menu.java:33)
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(CLI_menuTest.class);
	}
}