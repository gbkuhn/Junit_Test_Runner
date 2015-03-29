package main;
import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AnalyzeTest {
	
	public static Class<Test_class> obj = Test_class.class;

	@Test
    public void num_of_tests(){

        int total_test_count=0;
        for (Method method : obj.getDeclaredMethods()) {

            if (method.isAnnotationPresent(Test.class)||(method.isAnnotationPresent(Before.class))||(method.isAnnotationPresent(After.class))||(method.isAnnotationPresent(Desired.class))){

                total_test_count++;
            }

        }
        assertEquals(6,total_test_count);
    }
	
	@Test
    public void num_of_desired(){

        int desired_count=0;
        for (Method method : obj.getDeclaredMethods()) {

            if ((method.isAnnotationPresent(Desired.class))){

                desired_count++;
            }
        }
        assertEquals(1,desired_count);
    }
	
	@Test
	public void set_passed(){
/*
		 int a = 10;
		    Class firstClass = new Class();
		    firstClass.setValue(10);
		    int value = firstClass.getValue();
		    Assert.assertEquals(value, a);
		*/
		//assertEquals(passed,passed_buf)
	       // passed=passed_buf;
	 }
	
	@Test
	public void get_passed_subset(){

	    //return passed_subset;
	    }
	
	@Test
	public void get_failed(){

	    //return failed;
	    }
	@Test
	public void get_failed_subset(){

	     //return failed_subset;
	    }

	@Test
	public void analyze(){
	        int buffer = 0;

	        //return buffer;

	     throw new RuntimeException("Analyze exception");
	    }
	
	@Test
	public void determine(){

	        boolean outcome = false;
	       // return outcome;
	        throw new RuntimeException("Determine exception");

	    }
}
