package templatemethod;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class HalflingThiefTest {

    /**
     * Verify if the thief uses the provided stealing method
     */
    @Test
    void testSteal() {
        final var method = mock(StealingMethod.class);
        final var thief = new HalflingThief(method);

        thief.steal();
        verify(method).steal();

        verifyNoMoreInteractions(method);
    }

    /**
     * Verify if the thief uses the provided stealing method, and the new method after changing it
     */
    @Test
    void testChangeMethod() {
        final var initialMethod = mock(StealingMethod.class);
        final var thief = new HalflingThief(initialMethod);

        thief.steal();
        verify(initialMethod).steal();

        final var newMethod = mock(StealingMethod.class);
        thief.changeMethod(newMethod);

        thief.steal();
        verify(newMethod).steal();

        verifyNoMoreInteractions(initialMethod, newMethod);

    }
}