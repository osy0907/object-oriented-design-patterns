package singleton;

public class ThreadSafeLazyLoadedIvoryTowerTest extends SingletonTest<ThreadSafeLazyLoadedIvoryTower> {

    /**
     * Create a new singleton test instance using the given 'getInstance' method.
     */
    public ThreadSafeLazyLoadedIvoryTowerTest() {
        super(ThreadSafeLazyLoadedIvoryTower::getInstance);
    }
}