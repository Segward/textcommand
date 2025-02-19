package edu.ntnu.idat2003.capitalize;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.ntnu.idat2003.TextCommand;

public class CapitalizeTextCommand extends TextCommand {
  @Override
  public String execute(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }

    Pattern pattern = Pattern.compile("[a-zA-Z]");
    Matcher matcher = pattern.matcher(input);
    if (matcher.find()) {
      int index = matcher.start();
      return input.substring(0, index) + Character.toUpperCase(input.charAt(index)) + input.substring(index + 1);
    }

    return input;
  }
}