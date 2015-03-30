package main;
/**
 * Created by dmajo_000 on 3/20/2015.
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Test_class.class
        //JunitTest2.class
})
class SuiteClass_0 {
    //leave empty
}

/*
import junit.framework.Test;
import junit.framework.TestResult;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        Test_class.class
})

public class TestSuite implements Test {
    public TestSuite(Class<RunTests> runTestsClass) {
    }

    @Override
    public int countTestCases() {
        return 0;
    }

    @Override
    public void run(TestResult testResult) {

    }
}
*/
