package main;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RunTests{

    CLI_menu CLI_menu_obj= new CLI_menu();
    Results results = new Results();

    public static int passed_subset = 0, failed_subset = 0, count_subset = 0, ignore_subset = 0, before_subset = 0, after_subset = 0, desired_subset = 0;
    public static int passed = 0, failed = 0, count = 0, ignore = 0, before = 0, after = 0, desired = 0;

    public static int num_runs = CLI_menu.menu();

    public static int num_runs_buffer = num_runs;

    public static int desired_count;
    /*
        Object obj0 = Class.forName(args[0]).newInstance();
*/
    public static Class<Test_class> obj = Test_class.class;


    public static void main(String[] args) throws Exception {


                System.out.println("Testing Runner Starting...");

                //Class<Test_class> obj = Test_class.class;

                int total_num_tests = Analyze.num_of_tests(obj);

                System.out.println("Total number of tests: " + total_num_tests);

                int perc_runs = CLI_menu.menu_subset(obj,total_num_tests);

                desired_count=Analyze.num_of_desired(obj);

                double final_num_runs = ((perc_runs/100)*total_num_tests);

                //final_num_runs is the final ammount of test that will be run

                Analyze.display_info(obj);

                for(int runner_loop=0;runner_loop<=num_runs-1;runner_loop++) {

                    // Process @Test
                    for (Method method : obj.getDeclaredMethods()) {
/*
                        Analyze.test_process(method, obj,count,passed,passed_subset,failed,failed_subset);

                        passed = Analyze.get_passed();
                        passed_subset = Analyze.get_passed_subset();

                        failed=Analyze.get_failed();
                        failed_subset=Analyze.get_failed_subset();
*/

                        // if method is annotated with @Test
                        if (method.isAnnotationPresent(Test.class)&&desired_count<=0) {

                            Annotation annotation = method.getAnnotation(Test.class);
                            Test test = (Test) annotation;

                            // if enabled = true (default)
                            // if (test.enabled()) {

                            try {
                                method.invoke(obj.newInstance());
                                System.out.printf("%s: Test '%s' -> passed %n", ++count, method.getName());
                                passed++;
                                passed_subset++;
                            } catch (Throwable ex) {
                                System.out.printf("%s: Test '%s' -> failed: %s %n", ++count, method.getName(), ex.getCause());
                                failed++;
                                failed_subset++;
                            }

                        }

                        //process @before
                        if (method.isAnnotationPresent(Before.class)&&desired_count<=0) {

                            Annotation annotation = method.getAnnotation(Before.class);
                            Before test = (Before) annotation;


                            try {
                                method.invoke(obj.newInstance());
                                System.out.printf("%s: Test '%s' -> passed %n", ++count, method.getName());
                                passed++;
                                passed_subset++;
                                before++;
                                before_subset++;
                            } catch (Throwable ex) {
                                failed++;
                                failed_subset++;
                                before++;
                                before_subset++;
                                System.out.printf("%s: Test '%s' -> failed: %s %n", ++count, method.getName(), ex.getCause());
                            }

                        }
                        //process @after
                        if (method.isAnnotationPresent(After.class)&&desired_count<=0) {

                            Annotation annotation = method.getAnnotation(After.class);
                            After test = (After) annotation;

                            try {
                                method.invoke(obj.newInstance());
                                System.out.printf("%s: Test '%s' -> passed %n", ++count, method.getName());
                                passed++;
                                passed_subset++;
                                after++;
                                after_subset++;
                            } catch (Throwable ex) {
                                failed++;
                                failed_subset++;
                                after++;
                                after_subset++;
                                System.out.printf("%s: Test '%s' -> failed: %s %n", ++count, method.getName(), ex.getCause());


                            }
                        /*
                        } else {
                            System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                            ignore++;
                        }
                        */
                        }
                        //process @after
                        if (method.isAnnotationPresent(Ignore.class)&&desired_count<=0) {

                            Annotation annotation = method.getAnnotation(Ignore.class);
                            Ignore test = (Ignore) annotation;

                            try {
                                method.invoke(obj.newInstance());
                                System.out.printf("%s: Test '%s' -> passed %n", ++count, method.getName());
                                ignore++;
                                ignore_subset++;
                            } catch (Throwable ex) {
                                failed++;
                                ignore++;
                                ignore_subset++;
                                System.out.printf("%s: Test '%s' -> failed: %s %n", ++count, method.getName(), ex.getCause());

                            }

                        }

                        if (method.isAnnotationPresent(Desired.class)) {

                            Annotation annotation = method.getAnnotation(Desired.class);
                            Desired test = (Desired) annotation;

                            try {
                                method.invoke(obj.newInstance());
                                System.out.printf("%s: Test '%s' -> passed %n", ++count, method.getName());
                                desired++;
                                desired_subset++;
                                passed++;
                                passed_subset++;
                                desired_count--;
                            } catch (Throwable ex) {
                                failed++;
                                failed_subset++;
                                desired_count--;
                                System.out.printf("%s: Test '%s' -> failed: %s %n", ++count, method.getName(), ex.getCause());

                            }

                        }
                    }

                    Results.subset_report();

                    Results.reset_values();

                }
                Results.final_report();
                Results.percentages();
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