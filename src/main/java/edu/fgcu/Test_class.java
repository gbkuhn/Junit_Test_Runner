package main.java.edu.fgcu;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by geoffreykuhn on 3/10/15.
 */

//THIS CLASS IS JUST FOR TESTING THE RUNNER

@Runner_info(
        priority = Runner_info.Priority.HIGH,
        written_by = "Kuhn",
        tags = {"first tag","second tag" }
)

public class Test_class {
	
    @Must
    public void must_method_3(){ //
        //will return a pass
    }
	
    @Desired
    public void desired_method_3(){ //
        //will return a pass
    }
    
    @Before
    public void before_method_0(){ //
        //Will return as a before+1
    }
    

    @After
    public void after_method_1(){ //
        //will return as after+1
    }

    @Test
    public void pass_method_2(){ //
        //Will return as a pass
    }


    @Test
    public void failed_method_4() { //
        throw new RuntimeException("Intentionally Failed");
    }

    @Ignore
    public void ignore_method_5() {
        //ignore+1
    }

    public void empty_method_6(){
        //not tested
    }

    @Test public void method_7() {
        throw new RuntimeException("Intentionally Failed");
    }


}