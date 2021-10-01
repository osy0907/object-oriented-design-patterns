package prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Beast.
 */
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Beast implements Prototype {

  public Beast(Beast source) {
  }

  @Override
  public abstract Beast copy();

}
