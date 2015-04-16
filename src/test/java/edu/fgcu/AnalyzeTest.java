package test.java.edu.fgcu;

import main.java.edu.fgcu.Analyze;
import main.java.edu.fgcu.CLI_menu;
import main.java.edu.fgcu.Desired;
import main.java.edu.fgcu.Must;
import main.java.edu.fgcu.Test_class;
import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;

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
        desired_count = Analyze.num_of_desired(obj);
        assertEquals(1,desired_count);
    }
	
	@Test
    public void num_of_must(){

        int must_count=0;
		must_count = Analyze.num_of_must(obj);
        assertEquals(1,must_count);
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
    public void get_perc(){
        double total_num_tests = Analyze.num_of_tests(obj);

		double perc_runs = CLI_menu.menu_subset(obj,total_num_tests);
		

    	Analyze.get_perc(perc_runs, total_num_tests);	
		assertTrue(((perc_runs/100)*total_num_tests)>0);
		}
	
	@Test
    public void round(){
        double total_num_tests = Analyze.num_of_tests(obj);

		double perc_runs = CLI_menu.menu_subset(obj,total_num_tests);

        double final_num_runs = Analyze.get_perc(perc_runs, total_num_tests);

       //double rounded_buffer=((double)Math.round(final_num_runs * 1) / 1);
        double rounded_buffer = Analyze.round(final_num_runs);
        
    	assertTrue(rounded_buffer>0);
    }
	
	@Test
	public void display_info_test(){
		Analyze.display_info(obj);
	}
	
	@Test
	public void current_resources_test(){
		Analyze.current_resources();
	}
	
	@Test
	public void current_memory_usage_test(){
		Analyze.current_memory_usage();
	}
	
	@Test
	public void mem_check_test(){
		Analyze.mem_check();
	}
	
	@Test
	public void fill_array_test(){
		double total_num_tests = Analyze.num_of_tests(obj);
		ArrayList<Integer> testArr = new ArrayList<Integer>();
		Analyze.fill_array(testArr, total_num_tests);
	}
	
	@Test
	public void shuffle_arraylist_test(){
		double total_num_tests = Analyze.num_of_tests(obj);
		ArrayList<Integer> testArr = new ArrayList<Integer>();
		testArr = Analyze.fill_array(testArr, total_num_tests);
		Analyze.shuffle_arraylist(testArr);
	}
    
	@Test
	public void get_current_proc_test(){
		Analyze.get_current_proc();
	}
	
	@Test
	public void get_avail_mem_test(){
		Analyze.get_avail_mem();
	}
	
	@Test
	public void get_avail_jvm_mem_test(){
		Analyze.get_avail_jvm_mem();
	}
	
}
