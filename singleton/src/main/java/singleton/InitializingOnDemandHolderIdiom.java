package singleton;

public final class InitializingOnDemandHolderIdiom {

    /**
     * Private constructor.
     */
    private InitializingOnDemandHolderIdiom() {
    }

    /**
     * Singleton instance.
     *
     * @return Singleton instance
     */
    public static InitializingOnDemandHolderIdiom getInstance() {
        return HelperHolder.INSTANCE;
    }

    /**
     * Provides the lazy-loaded Singleton instance.
     */
    private static class HelperHolder {
        private static final InitializingOnDemandHolderIdiom INSTANCE =
                new InitializingOnDemandHolderIdiom();
    }
}