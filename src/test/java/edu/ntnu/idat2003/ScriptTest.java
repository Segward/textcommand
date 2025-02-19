package edu.ntnu.idat2003;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.ntnu.idat2003.capitalize.CapitalizeTextCommand;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class ScriptTest {

  @Test
  public void testExecute() {
    // Create a list of commands
    ArrayList<TextCommand> commands = new ArrayList<>();
    commands.add(new CapitalizeTextCommand());

    // Create a script with the list of commands
    Script script = new Script(commands);

    // Execute the script with a sample input
    String input = "hello world";
    String expectedOutput = "Hello world";
    String actualOutput = script.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }
}