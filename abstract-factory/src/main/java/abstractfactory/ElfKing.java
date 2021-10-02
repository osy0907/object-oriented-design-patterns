package abstractfactory;

/**
 * ElfKing.
 */
public class ElfKing implements King {

  static final String DESCRIPTION = "This is the elven king!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
