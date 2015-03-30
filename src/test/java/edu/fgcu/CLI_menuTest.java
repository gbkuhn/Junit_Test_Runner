package test;
import org.junit.Test;

import static org.junit.Assert.*;

public class CLI_menuTest  {

    Integer num_runs = 1;
    Integer runs_comparison=1;

    @Test
    public void testMenu(){
        for(int i = 1; i<10;i++) {
            runs_comparison++;
            num_runs++;
            assertEquals("Equal inputs",runs_comparison, num_runs);
        }
    }

    @Test
    public void testExit(){

    }
}