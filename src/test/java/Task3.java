import org.apache.log4j.Logger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static com.epam.lab.hw3.Task.multiply;
import static org.junit.Assert.assertEquals;

public class Task3 {
    static private Logger LOG = Logger.getLogger("ErrorLogger");

    @Rule
    public TestWatcher testWatcher = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            LOG.error(description.toString(), e);
            super.failed(e, description);
        }
    };

    @Test
    public void testWithLogger(){
        assertEquals(320, multiply(4,8));
    }
}
