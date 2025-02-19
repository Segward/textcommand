package edu.ntnu.idat2003.capitalize;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {
  @Override
  public String execute(String input) {
    String[] words = input.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
      sb.append(super.execute(word)).append(" ");
    }
    return sb.toString().trim();
  }
}
