package edu.ntnu.idat2003.capitalize;

import edu.ntnu.idat2003.TextCommand;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizeTextCommand implements TextCommand {

  @Override
  public String execute(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }
    
    // Find the first letter in the string and capitalize it
    Pattern pattern = Pattern.compile("[a-zA-Z]");
    Matcher matcher = pattern.matcher(input);

    // If a letter is found, capitalize it
    if (matcher.find()) {
      int index = matcher.start();
      return input.substring(0, index)
          + Character.toUpperCase(input.charAt(index))
          + input.substring(index + 1);
    }
    return input;
  }
}