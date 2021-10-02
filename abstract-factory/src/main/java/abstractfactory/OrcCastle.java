package abstractfactory;

/**
 * OrcCastle.
 */
public class OrcCastle implements Castle {

  static final String DESCRIPTION = "This is the orc castle!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
