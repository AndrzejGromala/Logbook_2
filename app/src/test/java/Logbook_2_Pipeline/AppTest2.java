package Logbook_2_Pipeline;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest2 {

    @Test public void maxVal() {
        // Arange
        App classUnderTest = new App();
        // Act and Assert
        int max = 666;
        assertEquals(classUnderTest.execute2(), max);

    }


}
