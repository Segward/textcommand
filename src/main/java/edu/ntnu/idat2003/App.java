package edu.ntnu.idat2003;

import edu.ntnu.idat2003.capitalize.CapitalizeSelectionTextCommand;
import edu.ntnu.idat2003.capitalize.CapitalizeTextCommand;
import edu.ntnu.idat2003.capitalize.CapitalizeWordsTextCommand;
import edu.ntnu.idat2003.replace.ReplaceFirstTextCommand;
import edu.ntnu.idat2003.replace.ReplaceTextCommand;
import edu.ntnu.idat2003.wrap.WrapLinesTextCommand;
import edu.ntnu.idat2003.wrap.WrapSelectionTextCommand;
import edu.ntnu.idat2003.wrap.WrapTextCommand;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    // Create a list of commands
    ArrayList<TextCommand> commands = new ArrayList<>();
    ReplaceTextCommand command1 = new ReplaceTextCommand("Hello", "hi");
    ReplaceFirstTextCommand command2 = new ReplaceFirstTextCommand("world", "universe");
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

    // Create a script with the list of commands
    Script script = new Script(commands);
    script.execute(
        "hello World, I love programming!\n I also love omniscient reader's viewpoint.\n bye bye!");
  }
}