package edu.ntnu.idat2003.wrap;

import edu.ntnu.idat2003.TextCommand;

public class WrapTextCommand extends TextCommand {
  protected final String prefix;
  protected final String suffix;

  public WrapTextCommand(String prefix, String suffix) {
    this.prefix = prefix;
    this.suffix = suffix;
  }

  @Override
  public String execute(String text) {
    return prefix + text + suffix;
  }
    
}
