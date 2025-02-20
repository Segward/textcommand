package edu.ntnu.idat2003.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private final String target;

  public WrapSelectionTextCommand(String prefix, String suffix, String target) {
    super(prefix, suffix);
    if (target == null
        || target.isBlank()
        || prefix == null
        || prefix.isBlank()
        || suffix == null
        || suffix.isBlank()) {
      throw new IllegalArgumentException("Target cannot be null or blank");
    }
    this.target = target;
  }

  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      return text;
    }
    return text.replaceAll(target, prefix + target + suffix);
  }

  public String getTarget() {
    return target;
  }
}
