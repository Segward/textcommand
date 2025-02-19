package edu.ntnu.idat2003.wrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WrapSelectionTextCommandTest {

  @Test
  public void testExecute() {
    // Create a WrapSelectionTextCommand
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("(", ")","world");

    // Execute the WrapSelectionTextCommand with a sample input
    String input = "hello world";
    String expectedOutput = "hello (world)";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }
}
