package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Application test
 */
class AppTest {

    /**
     * Issue: Add at least one assertion to this test case.
     * <p>
     * Solution: Inserted assertion to check whether the execution of the main method in {@link App}
     * throws an exception.
     */

    @Test
    void shouldExecuteApplicationWithoutException() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
