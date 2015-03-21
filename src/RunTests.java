import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.lang.reflect.*;
/*
class Annotated {
    //@Priority(info = "information goes here")
    public void test_method(String my_param) {
        System.out.println("Parameter" + my_param);
    }
}
*/
public class RunTests {

    public static int inputs(String class_name, int priority,int subset){
        int output=priority;
        //return output;
        throw new RuntimeException("iIputs exception");
    }

    public double[] run_tests(){
        double results[] = new double[0];

        throw new RuntimeException("run_tests exception");
    }

    public static void main(String[] args) throws Exception {
        int passed=0, failed=0, before=0, after=0, ignore=0;

        /*
        PriorityAnnotationParser priority_parser = new PriorityAnnotationParser();
        priorityMethods = priority_parser.parse(Annotated.class);
        */

        //for every priority found and while resources allow{
        //Request request = Request.method(priorityMethods[i]);
        //Result result = new JUnitCore().run(request);
        //then do all the stuff below with the result, adding it to a running total

        Result result = JUnitCore.runClasses(TestSuite.class);
        ignore = result.getIgnoreCount();
        failed = result.getFailureCount();
        passed = result.getRunCount()-failed;

        //and then run the non-priority methods doing the last bit above, until we run out of resources


        /*for (Method m:Class.forName(args[0]).getMethods()) {

            if (m.isAnnotationPresent(Ignore.class)) {
                    ignore++;
            }

            if (m.isAnnotationPresent(Before.class)) {
                try {
                    m.invoke(null);
                    before++;
                    //passed++;
                } catch (Throwable ex) {
                    System.out.printf("Test %s failed: %s %n", m, ex.getCause());
                    failed++;
                }
            }

            if (m.isAnnotationPresent(After.class)) {
                try {
                    m.invoke(null);
                    after++;
                    //passed++;
                } catch (Throwable ex) {
                    System.out.printf("Test %s failed: %s %n", m, ex.getCause());
                    failed++;
                }
            }

            if (m.isAnnotationPresent(Test.class)) {
                try {
                    m.invoke(null);
                    passed++;
                } catch (Throwable ex) {
                    System.out.printf("Test %s failed: %s %n", m, ex.getCause());
                    failed++;
                }
            }
        }*/

        System.out.printf("Passed: %d \nFailed: %d \nIgnored: %d \nBefore: %d \nAfter: %d", passed, failed, ignore, before, after);
    }
}
