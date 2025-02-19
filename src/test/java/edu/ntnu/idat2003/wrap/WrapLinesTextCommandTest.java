package edu.ntnu.idat2003.wrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WrapLinesTextCommandTest {

  @Test
  public void testExecute() {
    // Create a WrapLinesTextCommand
    WrapLinesTextCommand command = new WrapLinesTextCommand("(", ")");

    // Execute the WrapLinesTextCommand with a sample input
    String input = "hello\nworld";
    String expectedOutput = "(hello)\n(world)";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }
}
