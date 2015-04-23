package test.java.edu.fgcu;
import main.java.edu.fgcu.RunTests;

import org.junit.Test;

public class RunTestsTest {
	@Test
	public void mainTester(){
		try {
			RunTests.main(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
