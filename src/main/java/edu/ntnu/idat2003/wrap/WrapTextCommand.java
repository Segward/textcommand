package edu.ntnu.idat2003.wrap;

import edu.ntnu.idat2003.TextCommand;

public class WrapTextCommand extends TextCommand {
  protected final String prefix;
  protected final String suffix;

  public WrapTextCommand(String prefix, String suffix) {
    if (prefix == null || prefix.isBlank() || suffix == null || suffix.isBlank()) {
      throw new IllegalArgumentException("Prefix and suffix cannot be null or blank");
    }
    this.prefix = prefix;
    this.suffix = suffix;
  }

  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      return text;
    }
    return prefix + text + suffix;
  }

  public String getPrefix() {
    return prefix;
  }

  public String getSuffix() {
    return suffix;
  }
}
