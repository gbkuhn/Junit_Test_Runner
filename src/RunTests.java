import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RunTests {




    static Integer[] results_arr;
    public static int passed=0, failed=0, before=0, after=0, ignore=0,priority=0;

    CLI_menu CLI_menu_obj= new CLI_menu();
    Results results = new Results();
    /*
        CLI_menu.menu();

        Object obj0 = Class.forName(args[0]).newInstance();
*/
            public static void main(String[] args) throws Exception {

                System.out.println("Testing Runner Starting..");

                int passed = 0, failed = 0, count = 0, ignore = 0, before = 0, after = 0;

                Class<Test_class> obj = Test_class.class;

                // Process @TesterInfo
                if (obj.isAnnotationPresent(Runner_info.class)) {

                    Annotation annotation = obj.getAnnotation(Runner_info.class);
                    Runner_info testerInfo = (Runner_info) annotation;

                    System.out.printf("%nPriority: %s", testerInfo.priority());
                    System.out.printf("%nWrittenby: %s", testerInfo.written_by());
                    System.out.printf("%nTags: ");

                    int tagLength = testerInfo.tags().length;
                    for (String tag : testerInfo.tags()) {
                        if (tagLength > 1) {
                            System.out.print(tag + ", ");
                        } else {
                            System.out.print(tag);
                        }
                        tagLength--;
                    }

                    System.out.printf("%nLastModified :%s%n%n", testerInfo.modified_date());

                }

                // Process @Test
                for (Method method : obj.getDeclaredMethods()) {

                    // if method is annotated with @Test
                    if (method.isAnnotationPresent(Test.class)) {

                        Annotation annotation = method.getAnnotation(Test.class);
                        Test test = (Test) annotation;

                        // if enabled = true (default)
                       // if (test.enabled()) {

                            try {
                                method.invoke(obj.newInstance());
                                System.out.printf("%s: Test '%s' -> passed %n", ++count, method.getName());
                                passed++;
                            } catch (Throwable ex) {
                                System.out.printf("%s: Test '%s' -> failed: %s %n", ++count, method.getName(), ex.getCause());
                                failed++;
                            }
                        /*
                        } else {
                            System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                            ignore++;
                        }
                        */
                    }
                    //next annotation
                    if (method.isAnnotationPresent(Before.class)) {

                        Annotation annotation = method.getAnnotation(Before.class);
                        Before test = (Before) annotation;

                        // if enabled = true (default)
                        // if (test.enabled()) {

                        try {
                            method.invoke(obj.newInstance());
                            System.out.printf("%s: Test '%s' -> passed %n", ++count, method.getName());
                            passed++;
                            before++;
                        } catch (Throwable ex) {
                            System.out.printf("%s: Test '%s' -> failed: %s %n", ++count, method.getName(), ex.getCause());
                            failed++;
                        }
                        /*
                        } else {
                            System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                            ignore++;
                        }
                        */
                    }

                    if (method.isAnnotationPresent(After.class)) {

                        Annotation annotation = method.getAnnotation(After.class);
                        After test = (After) annotation;

                        // if enabled = true (default)
                        // if (test.enabled()) {

                        try {
                            method.invoke(obj.newInstance());
                            System.out.printf("%s: Test '%s' -> passed %n", ++count, method.getName());
                            passed++;
                            after++;
                        } catch (Throwable ex) {
                            System.out.printf("%s: Test '%s' -> failed: %s %n", ++count, method.getName(), ex.getCause());
                            failed++;
                        }
                        /*
                        } else {
                            System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                            ignore++;
                        }
                        */
                    }

                }
                System.out.printf("%nReport: Total: %d, Passed: %d, Failed: %d, Ignored: %d, Before: %d, After: %d%n", count, passed, failed, ignore, before, after);

            }
        }

/*
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

*/
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

/*
        System.out.printf("Passed: %d \nFailed: %d \nIgnored: %d \nBefore: %d \nAfter: %d \nPriority %d", passed, failed, ignore, before, after, priority);

    }

}
*/