package chapter16;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamPipelinesExampleTest {

    /**
     * This class is designed to perform unit testing on the StreamPipelinesExample class. 
     * Specifically, the main method of the StreamPipelinesExample class is tested in this class.
     */

    @Test
    @DisplayName("Test Main Method - StreamPipelinesExample")
    public void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String[] args = {}; 

        // assuming main() in StreamPipelinesExample creates several Member objects and then calculates 
        // and prints the average age of MALE members.
        
        // Given the member's age as presented in main(), the average age of MALE members is: (30+45)/2 = 37.5
        String expectedOutput = "37.5" + System.lineSeparator();

        StreamPipelinesExample.main(args);
        assertEquals(expectedOutput, outContent.toString());
    }

}
