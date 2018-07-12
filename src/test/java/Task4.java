import com.epam.lab.hw3.Task;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class Task4 {

    @Test
    public void testPrivate() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Task.class.getDeclaredMethod("adding", int.class, int.class);
        method.setAccessible(true);
        assertEquals(7, method.invoke(null, 3, 4));
    }
}
