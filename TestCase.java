#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import android.test.AndroidTestCase;
import android.util.Log;

public class ${NAME} extends AndroidTestCase {
    private final static String TAG = "${PROJECT_NAME}:${NAME}";

    public ${NAME}() {
        super();
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
       
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();

    }

    /**
     * Test something
     */
    public final void testSomething() {
        assertTrue("Implement test cases!", false);
        
    }
}
