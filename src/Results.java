/**
 * Created by geoffreykuhn on 3/10/15.
 */
public class Results extends RunTests {


    public static void subset_report() {

        System.out.printf("%n-->Subset Report: Total: %d, Passed: %d, Failed: %d, Ignored: %d, Before: %d, After: %d, Desired: %d%n\n", count_subset, passed_subset, failed_subset, ignore_subset, before_subset, after_subset, desired_subset);

    }

    public static void reset_values(){
        passed_subset = 0;
        failed_subset = 0;
        count_subset = 0;
        ignore_subset = 0;
        before_subset = 0;
        after_subset = 0;
        desired_subset = 0;

    }

    public static void final_report(){

        System.out.printf("%n-->Final Report: Total: %d, Passed: %d, Failed: %d, Ignored: %d, Before: %d, After: %d, Desired: %d%n", count, passed, failed, ignore, before, after, desired);


    }
}
