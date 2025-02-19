package edu.ntnu.idat2003.commands;

public class ReplaceTextCommand extends TextCommand {
  protected final String target;
  protected final String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  @Override
  public String execute(String text) {
    return text.replace(target, replacement);
  }
}

