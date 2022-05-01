import static org.junit.Assert.*;
import org.junit.*;
// javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar skill-demo-test.java
// java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore skill-demo-test

public class demo1Tester {
    @Test
    public void maxIntTest(){
        int[] arr = {1,4,6,0};
        int maxInt= demo1.maxInt(arr);
        assertEquals(6, maxInt);

    }
}