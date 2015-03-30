package test;
import main.Analyze;
import main.Desired;
import main.RunTests;
import main.Test_class;
import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Assert;
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
		int buffer =10;
		Analyze.set_passed(buffer);
		int value = Analyze.get_passed();
		assertEquals(value,buffer);
	 }
	
	@Test
	public void get_passed_subset(){
		int buffer = Analyze.get_passed_subset();
		assertTrue("return passed subset is out of range:" + buffer,0<=buffer&&buffer<=500);
		}
	
	@Test
	public void get_failed(){
		int buffer = Analyze.get_failed();
		assertTrue("return total failed is out of range:" + buffer,0<=buffer&&buffer<=500);	    
		}
	
	@Test
	public void get_failed_subset(){
		int buffer = Analyze.get_failed_subset();
		assertTrue("return failed subset is out of range:" + buffer,0<=buffer&&buffer<=500);
}

	@Test
	public void analyze(){
	        int buffer = 0;

	        //return buffer;

	    }
	
	@Test
	public void determine(){

	        boolean outcome = false;
	       // return outcome;

	    }
}
