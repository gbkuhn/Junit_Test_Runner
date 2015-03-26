import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by geoffreykuhn on 3/10/15.
 */
public class Analyze extends Test_class {


    public static void display_info(Class obj){


        if (obj.isAnnotationPresent(Runner_info.class)) {

            Annotation annotation = obj.getAnnotation(Runner_info.class);
            Runner_info testerInfo = (Runner_info) annotation;

            System.out.printf("%nPriority: %s", testerInfo.priority());
            System.out.printf("%nWrittenby: %s", testerInfo.written_by());
            System.out.printf("%nTags: ");

            int tag_size = testerInfo.tags().length;
            for (String tag : testerInfo.tags()) {
                if (tag_size>1) {
                    System.out.print(tag + ", ");
                } else {
                    System.out.print(tag);
                }
                tag_size--;
            }
            System.out.printf("%nLastModified: %s%n%n", testerInfo.modified_date());
        }

    }

    public static void test_process(Method method, Class obj, int count, int passed, int passed_subset, int failed, int failed_subset){

        if (method.isAnnotationPresent(Test.class)) {

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
                        /*
                        } else {
                            System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                            ignore++;
                        }
                        */
        }

    }

    public static int analyze(){
        int buffer = 0;

        //return buffer;

        throw new RuntimeException("Analyze exception");
    }

    public static boolean determine(){

        boolean outcome = false;
       // return outcome;
        throw new RuntimeException("Determine exception");

    }

}
