import com.epam.lab.hw3.Task;
import org.junit.Test;

import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

public class Task12 {
    @Test
    public void testStrings(){
        Task task1 = new Task("Name", "Name");
        assertSame(task1.getString(), task1.getName());
    }

    @Test
    public void testClass(){
        Task task1 = new Task("Name");
        assertThat(task1.getName(), isA(String.class));
    }
}
