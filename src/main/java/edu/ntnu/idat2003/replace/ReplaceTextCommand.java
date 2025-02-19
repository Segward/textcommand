package edu.ntnu.idat2003.replace;

import edu.ntnu.idat2003.TextCommand;

public class ReplaceTextCommand extends TextCommand {
  protected final String target;
  protected final String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    if (target == null || target.isBlank() || replacement == null || replacement.isBlank()) {
      throw new IllegalArgumentException("Target or replacement cannot be null or blank");
    }
    this.target = target;
    this.replacement = replacement;
  }

  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      return text;
    }
    return text.replace(target, replacement);
  }

  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }
}
