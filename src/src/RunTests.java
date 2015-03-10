import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.*;

public class RunTests {
    public static void main(String[] args) throws Exception {
        int passed = 0, failed = 0, before = 0, after = 0, ignore = 0;

        for (Method m : Class.forName(args[0]).getMethods()) {

            if (m.isAnnotationPresent(Ignore.class)) {
                    ignore++;
            }

            if (m.isAnnotationPresent(Before.class)) {
                try {
                    m.invoke(null);
                    before++;
                    passed++;
                } catch (Throwable ex) {
                    System.out.printf("Test %s failed: %s %n", m, ex.getCause());
                    failed++;
                }
            }

            if (m.isAnnotationPresent(After.class)) {
                try {
                    m.invoke(null);
                    after++;
                    passed++;
                } catch (Throwable ex) {
                    System.out.printf("Test %s failed: %s %n", m, ex.getCause());
                    failed++;
                }
            }

            if (m.isAnnotationPresent(Test.class)) {
                try {
                    m.invoke(null);
                    passed++;
                } catch (Throwable ex) {
                    System.out.printf("Test %s failed: %s %n", m, ex.getCause());
                    failed++;
                }
            }
        }
        System.out.printf("Passed: %d \nFailed: %d \nIgnored: %d \nBefore: %d \nAfter: %d", passed, failed, ignore, before, after);
    }
}
