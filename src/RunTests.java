import com.sun.net.httpserver.Authenticator;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.*;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;

public class RunTests {




    static Integer[] results_arr;
    public static int passed=0, failed=0, before=0, after=0, ignore=0,priority=0;

    CLI_menu CLI_menu_obj= new CLI_menu();
    Results results = new Results();

    public static void main(String[] args) throws Exception {

        CLI_menu.menu();

        Object obj0 = Class.forName(args[0]).newInstance();


        for (Method m:Class.forName(args[0]).getMethods()) {
            if (m.isAnnotationPresent(Subset.class)) { //subset test
                try {
                    System.out.println("SUBSET IS FUNCTIONAl");
                    m.invoke(obj0);
                    passed++;
                } catch (Exception e) {
                    System.out.printf("Test %s failed: %s\n", m, e.getCause());
                    failed++;
                }
            }
        }

        for (Method m:Class.forName(args[0]).getMethods()) {
            if (m.isAnnotationPresent(Ignore.class)) {
                try {
                    ignore++;
                    results_arr[0]=ignore;
                } catch (Exception e) {
                    System.out.printf("Test %s failed: %s\n", m, e.getCause());
                    failed++;
                }
            }
        }


        for (Method m : Class.forName(args[0]).getMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                try {
                    m.invoke(obj0);
                    passed++;
                    results_arr[1]=passed;
                } catch (Exception e) {
                    System.out.printf("Test %s failed: %s\n", m, e.getCause());
                    failed++;
                }
            }
        }


        for (Method m : Class.forName(args[0]).getMethods()) {
            if (m.isAnnotationPresent(Before.class)) {
                try {
                    m.invoke(obj0);
                    passed++;
                    before++;
                    results_arr[2]=before;
                } catch (Exception e) {
                    System.out.printf("Test %s failed: %s\n", m, e.getCause());
                    failed++;
                }
            }
        }


        for (Method m : Class.forName(args[0]).getMethods()) {
            if (m.isAnnotationPresent(After.class)) {
                try {
                    m.invoke(obj0);
                    passed++;
                    after++;
                    results_arr[3]=after;
                } catch (Exception e) {
                    System.out.printf("Test %s failed: %s\n", m, e.getCause());
                    failed++;
                }
            }
        }


        for (Method m : Class.forName(args[0]).getMethods()) {
            if (m.isAnnotationPresent(Priority.class)) {
                try {
                    m.invoke(obj0);
                    passed++;
                    priority++;
                    results_arr[4]=priority;
                } catch (Exception e) {
                    System.out.printf("Test %s failed: %s\n", m, e.getCause());
                    failed++;
                }
            }
        }

//        results.report(results_arr); //print put the report

        /*
//completely functional but of no use right now
        Result result = JUnitCore.runClasses(SuiteClass_0.class);
        Result result2 =JUnitCore.runClasses(SuiteClass_0.class);

        for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
            System.out.println(result.wasSuccessful());
*/
        System.out.printf("Passed: %d \nFailed: %d \nIgnored: %d \nBefore: %d \nAfter: %d \nPriority %d", passed, failed, ignore, before, after, priority);

    }

}