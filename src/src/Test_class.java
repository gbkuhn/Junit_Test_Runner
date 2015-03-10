import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by geoffreykuhn on 3/10/15.
 */
public class Test_class {

    @Before
    public static void method_0(){
        //Will return as a before+1
    }

    @After
    public static void method_1(){
        //will return as after+1
    }

    @Test
    public static void method_2(){
    //Will return as a pass
    }

    public static void method_3(){
    //empty, not a pass or a fail
    }

    @Test public static void method_4() {
        throw new RuntimeException("Intentionally Failed");
    }

    @Ignore
    public static void method_5() {
    //ignore+1
    }

    @Test public static void method_6(){

    }

    public static void method_7(){
    //empty, not a pass or a fail
    }

    @Test public static void method_8() {
        throw new RuntimeException("Intentionally Failed");
    }

    public static void method_9(){
    //not a pass or a fail
    }

}
