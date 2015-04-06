package main.java.edu.fgcu;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Analyze extends Test_class{
    public static int passed_subset, failed_subset, count_subset, ignore_subset, before_subset, after_subset, desired_subset;
    public static int passed, failed, count, ignore, before, after, desired;

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

    public static int num_of_tests(Class<Test_class> obj){

        int total_test_count=0;
        for (Method method : obj.getDeclaredMethods()) {

            if (method.isAnnotationPresent(Test.class)||(method.isAnnotationPresent(Before.class))||(method.isAnnotationPresent(After.class))||(method.isAnnotationPresent(Desired.class))){

                total_test_count++;
            }

        }
        return total_test_count;
    }

    public static int num_of_desired(Class<Test_class> obj){

        int desired_count=0;
        for (Method method : obj.getDeclaredMethods()) {

            if ((method.isAnnotationPresent(Desired.class))){

                desired_count++;
            }
        }
        return desired_count;
    }

  
    public static void set_passed(int passed_buf){

        passed=passed_buf;
    }

    public static int get_passed(){

        return passed;
    }

    public static int get_passed_subset(){

        return passed_subset;
    }

    public static int get_failed(){

        return failed;
    }

    public static int get_failed_subset(){

        return failed_subset;
    }


    public static double get_perc(double perc_runs, double total_num_tests){
    	return ((perc_runs/100)*total_num_tests);

   }

    public static double round(double final_num_runs){

    	return (double)Math.round(final_num_runs * 1) / 1;
    }

}
