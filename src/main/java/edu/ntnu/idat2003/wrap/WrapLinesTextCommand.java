package edu.ntnu.idat2003.wrap;

public class WrapLinesTextCommand extends WrapTextCommand {
  public WrapLinesTextCommand(String prefix, String suffix) {
    super(prefix, suffix);
  }

  @Override
  public String execute(String text) {
    return prefix + text.replaceAll("\n", suffix + "\n" + prefix) + suffix;
  }
}
