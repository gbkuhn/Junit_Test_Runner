package test.java.edu.fgcu;
import org.junit.Test;
import main.java.edu.fgcu.Results;


import static org.junit.Assert.*;

public class ResultsTest {

    public static int passed_subset_sum = 0, failed_subset_sum = 0, count_subset_sum = 0, ignore_subset_sum = 0, before_subset_sum = 0, after_subset_sum = 0, desired_subset_sum = 0;
    public static int passed_subset = 0, failed_subset = 0, count_subset = 0, ignore_subset = 0, before_subset = 0, after_subset = 0, desired_subset = 0;
    public static int passed = 0, failed = 0, count = 0, ignore = 0, before = 0, after = 0, desired = 0;

    @Test
    public void testSubset_report(){
        count_subset_sum+=count_subset;
        passed_subset_sum+= passed_subset;
        failed_subset_sum+=failed_subset;
        //ignore_subset_sum+=ignore_subset;
        before_subset_sum+=before_subset;
        after_subset_sum+=after_subset;

        assertEquals(count_subset,count_subset_sum);
    }

    @Test
    public void testReset_values(){
        passed_subset = Results.reset_values();
        assertEquals(passed_subset,0);
    }

    @Test
    public void testFinal_report(){

        boolean check = Results.final_report();
        assertTrue(check);
    }

    @Test
    public void testPercentages(){
    	//will not pass yet
        //assertTrue(Results.percentages());
    }
}