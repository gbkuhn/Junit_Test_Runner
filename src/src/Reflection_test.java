import java.lang.reflect.Method;

//initial commit
//Reflection test that returns the name of the class

public class Reflection_test {
    public static void main(String[] args){
        Test_class obj = new Test_class();
        System.out.println(obj.getClass().getName());
    }
}

class Test_class {
    public void print_out() {
        //placeholder
    }
}