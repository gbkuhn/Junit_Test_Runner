package test.java.edu.fgcu;
import org.junit.Test;

import main.java.edu.fgcu.CLI_menu;

import static org.junit.Assert.*;

public class CLI_menuTest  {
   

    @Test
    public void testMenu(){
    	int buffer  = CLI_menu.menu();

		assertTrue("return CLI loops is out of range:" + buffer,0<=buffer&&buffer<=500);
        
    }

    @Test
    public void testExit(){
    	//unimplemented
        throw new RuntimeException("textExit Failed");

    }
}