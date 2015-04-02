package test.java.edu.fgcu;

import test.java.edu.fgcu.ResultsTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	AnalyzeTest.class,
	CLI_menuTest.class,
	ResultsTest.class,
})
public class TestAll {

	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
