package edu.ntnu.idat2003.commands;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
  private final String target;

  public CapitalizeSelectionTextCommand(String target) {
    this.target = target;
  }

  @Override
  public String execute(String input) {
    return input.replace(target, super.execute(target));
  }
}
