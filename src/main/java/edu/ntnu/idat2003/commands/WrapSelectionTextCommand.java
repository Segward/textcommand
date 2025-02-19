package edu.ntnu.idat2003.commands;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private final String target;
  
  public WrapSelectionTextCommand(String prefix, String suffix, String target) {
    super(prefix, suffix);
    this.target = target;
  }

  @Override
  public String execute(String text) {
    return text.replace(target, prefix + target + suffix);
  }
}
