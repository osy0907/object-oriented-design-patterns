package singleton;

public class InitializingOnDemandHolderIdiomTest extends SingletonTest<InitializingOnDemandHolderIdiom> {

    /**
     * Create a new singleton test instance using the given 'getInstance' method.
     */
    public InitializingOnDemandHolderIdiomTest() {
        super(InitializingOnDemandHolderIdiom::getInstance);
    }

}