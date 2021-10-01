package singleton;

public class EnumIvoryTowerTest extends SingletonTest<EnumIvoryTower> {

    /**
     * Create a new singleton test instance using the given 'getInstance' method.
     */
    public EnumIvoryTowerTest() {
        super(() -> EnumIvoryTower.INSTANCE);
    }
}