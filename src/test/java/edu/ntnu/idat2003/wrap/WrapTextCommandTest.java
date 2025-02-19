package edu.ntnu.idat2003.wrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WrapTextCommandTest {

  @Test
  public void testExecute() {
    // Create a WrapTextCommand
    WrapTextCommand command = new WrapTextCommand("(", ")");

    // Execute the WrapTextCommand with a sample input
    String input = "hello world";
    String expectedOutput = "(hello world)";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }
}
