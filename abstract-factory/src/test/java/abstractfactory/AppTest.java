package abstractfactory;

import abstractfactory.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Check whether the execution of the main method in {@link App} throws an exception.
 */
class AppTest {
    
  @Test
  void shouldExecuteApplicationWithoutException() {

	  assertDoesNotThrow(() -> App.main(new String[]{}));
  }
}
