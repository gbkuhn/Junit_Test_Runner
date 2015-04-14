package main.java.edu.fgcu;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by geoffreykuhn on 3/10/15.
 */
public class Results extends RunTests {

    public static int passed_subset_sum = 0, failed_subset_sum = 0, count_subset_sum = 0, ignore_subset_sum = 0, before_subset_sum = 0, after_subset_sum = 0, desired_subset_sum = 0, must_subset_sum = 0;

    public static void subset_report() {

        System.out.printf("%n-->Subset Report: Passed: %d, Failed: %d, Ignored: %d, Before: %d, After: %d, Desired: %d, , Must: %d%n\n", passed_subset, failed_subset, ignore_subset, before_subset, after_subset, desired_subset, must_subset);

        //adds to sum for averages method
        count_subset_sum+=count_subset;
        passed_subset_sum+= passed_subset;
        failed_subset_sum+=failed_subset;
        ignore_subset_sum+=ignore_subset;
        before_subset_sum+=before_subset;
        after_subset_sum+=after_subset;
        desired_subset_sum+=desired_subset;
        must_subset_sum+=must_subset;
    }

    public static int reset_values(){
        passed_subset = 0;
        failed_subset = 0;
        count_subset = 0;
        ignore_subset = 0;
        before_subset = 0;
        after_subset = 0;
        desired_subset = 0;
        must_subset = 0;

        return passed_subset;
    }

    public static boolean final_report(){

        System.out.printf("%n-->Final Report: Total: %d, Passed: %d, Failed: %d, Ignored: %d, Before: %d, After: %d, Desired: %d, Must: %d%n", count, passed, failed, ignore, before, after, desired, must);
        if(count>=0){
            return true;
        }
        return false;
    }

    public static boolean percentages(){
        if((before_subset_sum< 0) || (passed_subset_sum<0)|| (after_subset_sum<0)){
            return false;
        }
/*
        double passed_perc = num_runs_buffer/passed_subset_sum;
        double failed_perc = num_runs_buffer/failed_subset_sum;
        double before_perc = num_runs_buffer/before_subset_sum;
        double after_perc  = num_runs_buffer/after_subset_sum;
        double desired_perc = 0;//        double desired_perc = num_runs_buffer/desired_subset_sum;
*/
        //System.out.printf("%n-->Percentages: Passed: %f, Failed: %f, Ignored: %f, Before: %f, After: %f, Desired: %f%n", passed_perc, failed_perc, 0, before_perc, after_perc, desired_perc);
        
        return true;
    }
    

}
