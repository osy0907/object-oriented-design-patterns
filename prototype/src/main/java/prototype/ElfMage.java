package prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * ElfMage.
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class ElfMage extends Mage {

  private final String helpType;

  public ElfMage(ElfMage elfMage) {
    super(elfMage);
    this.helpType = elfMage.helpType;
  }

  @Override
  public ElfMage copy() {
    return new ElfMage(this);
  }

  @Override
  public String toString() {
    return "Elven mage helps in " + helpType;
  }

}
