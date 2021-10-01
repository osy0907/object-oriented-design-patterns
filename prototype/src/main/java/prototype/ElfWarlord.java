package prototype;

import lombok.EqualsAndHashCode;

/**
 * ElfWarlord.
 */
@EqualsAndHashCode(callSuper = true)
public class ElfWarlord extends Warlord {

  private final String helpType;

  public ElfWarlord(String helpType) {
    this.helpType = helpType;
  }

  public ElfWarlord(ElfWarlord elfWarlord) {
    super(elfWarlord);
    this.helpType = elfWarlord.helpType;
  }

  @Override
  public ElfWarlord copy() {
    return new ElfWarlord(this);
  }

  @Override
  public String toString() {
    return "Elven warlord helps in " + helpType;
  }
}