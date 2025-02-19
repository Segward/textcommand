package edu.ntnu.idat2003.wrap;

public class WrapLinesTextCommand extends WrapTextCommand {

  public WrapLinesTextCommand(String prefix, String suffix) {
    super(prefix, suffix);
    if (prefix == null || prefix.isBlank() || suffix == null || suffix.isBlank()) {
      throw new IllegalArgumentException("Prefix and suffix cannot be null or blank");
    }
  }

  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      return text;
    }
    return prefix + text.replaceAll("\n", suffix + "\n" + prefix) + suffix;
  }
}
