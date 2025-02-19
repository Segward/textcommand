package edu.ntnu.idat2003.capitalize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CapitalizeWordsTextCommandTest {

  @Test
  public void testExecute() {
    // Create a CapitalizeWordsTextCommand
    CapitalizeTextCommand command = new CapitalizeWordsTextCommand();

    // Execute the CapitalizeWordsTextCommand with a sample input
    String input = "hello world";
    String expectedOutput = "Hello World";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }
}
