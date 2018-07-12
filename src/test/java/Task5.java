import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static com.epam.lab.hw3.Task.fileCreation;
import static org.junit.Assert.assertTrue;

public class Task5 {
    static File file = new File("/Users/lni/IdeaProjects/h3w/file.txt");

    @Before
    public void init() throws IOException {
        fileCreation();
    }

    @Test
    public void testFileCreation(){
        assertTrue(file.exists());
    }

    @After
    public void delete(){
        file.delete();
    }
}
