package edu.ntnu.idat2003.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
  private final String target;

  public CapitalizeSelectionTextCommand(String target) {
    if (target == null || target.isBlank()) {
      throw new IllegalArgumentException("Target cannot be null or blank");
    }
    this.target = target;
  }

  @Override
  public String execute(String input) {
    if (input == null || input.isBlank()) {
      return input;
    }
    return input.replace(target, super.execute(target));
  }

  public String getTarget() {
    return target;
  }
}
