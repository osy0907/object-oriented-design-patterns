package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    /**
     * Test if we get the expected exception when trying to create a hero without a profession
     */
    @Test
    void testMissingProfession() {
        assertThrows(IllegalArgumentException.class, () -> new Hero.Builder(null, "Sir without a job"));
    }

    /**
     * Test if we get the expected exception when trying to create a hero without a name
     */
    @Test
    void testMissingName() {
        assertThrows(IllegalArgumentException.class, () -> new Hero.Builder(Profession.THIEF, null));
    }

    /**
     * Test if the hero build by the builder has the correct attributes, as requested
     */
    @Test
    void testBuildHero() {
        final String heroName = "Sir Lancelot";

        final var hero = new Hero.Builder(Profession.WARRIOR, heroName)
                .withArmor(Armor.CHAIN_MAIL)
                .withWeapon(Weapon.SWORD)
                .withHairType(HairType.LONG_CURLY)
                .withHairColor(HairColor.BLOND)
                .build();

        assertNotNull(hero);
        assertNotNull(hero.toString());
        assertEquals(Profession.WARRIOR, hero.getProfession());
        assertEquals(heroName, hero.getName());
        assertEquals(Armor.CHAIN_MAIL, hero.getArmor());
        assertEquals(Weapon.SWORD, hero.getWeapon());
        assertEquals(HairType.LONG_CURLY, hero.getHairType());
        assertEquals(HairColor.BLOND, hero.getHairColor());

    }
}