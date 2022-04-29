import static org.junit.Assert.*;
import org.junit.*;


public class demo1Tester {
    @Test
    public void maxIntTest(){
        int[] arr = {1,4,6,0};
        int maxInt= demo1.maxInt(arr);
        assertEquals(6, maxInt);

    }
}