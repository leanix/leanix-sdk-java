import org.junit.Test;

public class ThrowExceptionTest {

    @Test(expected = RuntimeException.class)
    public void testExceptionOutput() {
        throw new RuntimeException("bahl");
    }
}
