import com.epam.lab.hw3.Task;
import org.junit.Test;

import static com.epam.lab.hw3.Task.multiply;
import static org.junit.Assert.*;

public class Task11 {

    @Test
    public void testMultiply(){
        assertEquals(32, multiply(4,8));
    }

    @Test
    public void testName(){
        Task task1 = new Task("Name");
        assertTrue(task1.notEmptyName());
    }

    @Test
    public void testString(){
        Task task1 = new Task("Name");
        assertNull(task1.getString());
    }

}
