package templatemethod;

public class SubtleMethodTest extends StealingMethodTest<SubtleMethod> {

    /**
     * Create a new test for the {@link SubtleMethod}
     */
    public SubtleMethodTest() {
        super(
                new SubtleMethod(),
                "shop keeper",
                "The target has been chosen as shop keeper.",
                "Approach the shop keeper with tears running and hug him!",
                "While in close contact grab the shop keeper's wallet."
        );
    }

}