package prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Mage.
 */
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Mage implements Prototype {

  public Mage(Mage source) {
  }

  @Override
  public abstract Mage copy();

}
