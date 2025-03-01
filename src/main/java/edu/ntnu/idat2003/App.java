package edu.ntnu.idat2003;

import edu.ntnu.idat2003.capitalize.*;
import edu.ntnu.idat2003.replace.*;
import edu.ntnu.idat2003.wrap.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    // Create a list of commands
    ArrayList<TextCommand> commands = new ArrayList<>();
    try {
      // Create a list of commands
      ReplaceTextCommand command1 = new ReplaceTextCommand("hello", "hi");
      ReplaceFirstTextCommand command2 = new ReplaceFirstTextCommand("love", "universe");
      WrapTextCommand command3 = new WrapTextCommand("#", "#");
      WrapSelectionTextCommand command4 = new WrapSelectionTextCommand("(", ")", "love");
      WrapLinesTextCommand command5 = new WrapLinesTextCommand("...", "...");
      CapitalizeTextCommand command6 = new CapitalizeTextCommand();
      CapitalizeSelectionTextCommand command7 = new CapitalizeSelectionTextCommand("love");
      CapitalizeWordsTextCommand command8 = new CapitalizeWordsTextCommand();

      // Add the commands to the list
      commands.add(command1);
      commands.add(command2);
      commands.add(command3);
      commands.add(command4);
      commands.add(command5);
      commands.add(command6);
      commands.add(command7);
      commands.add(command8);
    } catch (Exception e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    // Create a script with the list of commands
    if (!commands.isEmpty()) {
      Script script = new Script(commands);
      script.execute(
          "hello world, I love programming!\n"
              + " I also love omniscient reader's viewpoint.\n"
              + " bye bye my love, mi amor!");
    }
  }
}