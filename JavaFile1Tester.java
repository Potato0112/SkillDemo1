import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class JavaFile1Tester {
    @Test  
    public void multiplyby2test(){
        assertEquals(6, JavaFile1.multiplyby2(3));
    }
}
