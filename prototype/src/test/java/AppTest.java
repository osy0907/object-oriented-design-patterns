import org.junit.jupiter.api.Test;
import prototype.App;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Application test
 */
class AppTest {

  @Test
  void shouldExecuteApplicationWithoutException() {
    assertDoesNotThrow(() -> App.main(new String[]{}));
  }
}
