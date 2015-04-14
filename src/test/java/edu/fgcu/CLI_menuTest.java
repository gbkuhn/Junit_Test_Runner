package test.java.edu.fgcu;
import org.junit.Test;

import main.java.edu.fgcu.Analyze;
import main.java.edu.fgcu.CLI_menu;
import main.java.edu.fgcu.Test_class;
import static org.junit.Assert.*;

public class CLI_menuTest  {
	public static Class<Test_class> obj = Test_class.class;

    @Test
    public void testMenu(){
    	int buffer  = CLI_menu.menu();

		//assertEquals(0,buffer);
        assertTrue("return CLI loops is out of range:" + buffer,0<=buffer&&buffer<=500);

    }
    
    @Test
    public void menu_subset_test(){
    	double total_num_tests = Analyze.num_of_tests(obj);
    	CLI_menu.menu_subset(obj, total_num_tests);
    }
    
    @Test
    public void print_total_tests_test(){
    	double total_num_tests = Analyze.num_of_tests(obj);
    	CLI_menu.print_total_tests(total_num_tests);
    }
    
    @Test(expected = RuntimeException.class)
    public void testExit(){
    	//unimplemented
        //throw new RuntimeException("textExit Failed");
    	CLI_menu.exit();
    }
}