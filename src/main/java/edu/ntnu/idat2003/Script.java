package edu.ntnu.idat2003;

import java.util.ArrayList;

public class Script {
  private ArrayList<TextCommand> commands;

  public Script(ArrayList<TextCommand> commands) {
    if (commands == null || commands.isEmpty()) {
      throw new IllegalArgumentException("Commands cannot be null or empty");
    }
    this.commands = commands;
  }

  public String execute(String text) {
    if (text == null || text.isBlank()) {
      return text;
    }
    System.out.println("\n" + text + "\n");
    for (TextCommand command : commands) {
      text = command.execute(text);
      System.out.println(text + "\n");
    }
    return text;
  }
}
