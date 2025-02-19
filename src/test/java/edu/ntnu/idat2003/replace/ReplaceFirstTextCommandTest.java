package edu.ntnu.idat2003.replace;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReplaceFirstTextCommandTest {

  @Test
  public void testExecute() {
    // Create a ReplaceFirstTextCommand
    ReplaceTextCommand command = new ReplaceFirstTextCommand("world", "planet");

    // Execute the ReplaceFirstTextCommand with a sample input
    String input = "hello world";
    String expectedOutput = "hello planet";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }
}
