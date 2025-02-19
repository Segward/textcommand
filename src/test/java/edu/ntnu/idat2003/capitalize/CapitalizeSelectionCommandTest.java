package edu.ntnu.idat2003.capitalize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CapitalizeSelectionCommandTest {

  @Test
  public void testExecute() {
    // Create a CapitalizeSelectionTextCommand
    CapitalizeTextCommand command = new CapitalizeSelectionTextCommand("world");

    // Execute the CapitalizeSelectionTextCommand with a sample input
    String input = "hello world";
    String expectedOutput = "hello World";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }
}
