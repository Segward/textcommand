package edu.ntnu.idat2003.replace;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
    if (target == null || target.isBlank() || replacement == null || replacement.isBlank()) {
      throw new IllegalArgumentException("Target cannot be null or blank");
    }
  }

  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      return text;
    }
    return text.replaceFirst(target, replacement);
  }
}
