package student;
import org.junit.Test;
import java.io.File;
import static org.junit.Assert.*;
public class StudentScoreLoggerTest {
	
	@Test
    public void testFileWriteAndThreadCompletion() {
        StudentScoreLogger.main(null);

        File file = new File("scores.csv");
        assertTrue("File should exist after writing", file.exists());
        assertTrue("File should not be empty", file.length() > 0);
    }
}
	
	


