package main.java.edu.fgcu;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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
    
    public static ArrayList<Integer> fill_array(ArrayList<Integer> rand_array, double total_num_tests){
		
		for (int i=0; i<total_num_tests; i++)
		{
			rand_array.add(i);
			//System.out.println(arrayRandom);
		}
    	
    	return rand_array;
    }
    
	public static ArrayList<Integer> shuffle_arraylist(ArrayList<Integer> rand_array) {

		long seed = System.nanoTime();
		Collections.shuffle(rand_array, new Random(seed));
		
		sort_desired_must(rand_array);
		
		return rand_array;
	}
	
	public static ArrayList<Integer> sort_desired_must(ArrayList<Integer> rand_array){
		
		int saved_index1=0;
		int saved_index2=0;
		
		for(int i = rand_array.size()-1; i >= 0; i--) {
			if(rand_array.get(i)==0){
				saved_index1 = i;	
			}
			if(rand_array.get(i)==1){
				saved_index2 = i;
			}
		}
		
		int saved1 = rand_array.get(0);
		int saved2 = rand_array.get(1);
		rand_array.set(0, 0);
		rand_array.set(1, 1);  
		
		rand_array.set(saved_index1, saved1);
		rand_array.set(saved_index2, saved2);

		//System.out.println(rand_array);
		
		return rand_array;
	}

    public static int num_of_tests(Class<Test_class> obj){

        int total_test_count=0;
        for (Method method : obj.getDeclaredMethods()) {

            if (method.isAnnotationPresent(Test.class)||(method.isAnnotationPresent(Before.class))||(method.isAnnotationPresent(After.class))||(method.isAnnotationPresent(Desired.class))||(method.isAnnotationPresent(Ignore.class))||(method.isAnnotationPresent(Must.class))){

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
    
    public static int num_of_must(Class<Test_class> obj){

        int must_count=0;
        for (Method method : obj.getDeclaredMethods()) {

            if ((method.isAnnotationPresent(Must.class))){

                must_count++;
            }
        }
        return must_count;
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
