package singleton;

public class IvoryTowerTest extends SingletonTest<IvoryTower> {

    /**
     * Create a new singleton test instance using the given 'getInstance' method.
     */
    public IvoryTowerTest() {
        super(IvoryTower::getInstance);
    }

}