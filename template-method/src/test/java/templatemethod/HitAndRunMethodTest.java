package templatemethod;

public class HitAndRunMethodTest extends StealingMethodTest<HitAndRunMethod> {

    /**
     * Create a new test for the {@link HitAndRunMethod}
     */
    public HitAndRunMethodTest() {
        super(
                new HitAndRunMethod(),
                "old goblin woman",
                "The target has been chosen as old goblin woman.",
                "Approach the old goblin woman from behind.",
                "Grab the handbag and run away fast!"
        );
    }

}