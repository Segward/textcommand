package edu.ntnu.idat2003;

import java.util.ArrayList;

public class Script {
  private ArrayList<TextCommand> commands;

  public Script(ArrayList<TextCommand> commands) {
    this.commands = commands;
  }

  public String execute(String text) {
    System.out.println(text + "\n");
    for (TextCommand command : commands) {
      text = command.execute(text);
      System.out.println(text + "\n");
    }
    return text;
  }
}
