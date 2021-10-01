package prototype;

/**
 * Concrete factory class.
 */
public record HeroFactoryImpl(
        Mage mage,
        Warlord warlord,
        Beast beast) implements HeroFactory {

    /**
     * Create mage.
     */
    public Mage createMage() {
        return mage.copy();
    }

    /**
     * Create warlord.
     */
    public Warlord createWarlord() {
        return warlord.copy();
    }

    /**
     * Create beast.
     */
    public Beast createBeast() {
        return beast.copy();
    }

}
