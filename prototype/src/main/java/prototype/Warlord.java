package prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Warlord.
 */
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Warlord implements Prototype {

  public Warlord(Warlord source) {
  }

  @Override
  public abstract Warlord copy();

}
