package edu.ntnu.idat2003.capitalize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CapitalizeTestCommandTest {

  @Test
  public void testExecute() {
    // Create a CapitalizeTextCommand
    CapitalizeTextCommand command = new CapitalizeTextCommand();

    // Execute the CapitalizeTextCommand with a sample input
    String input = "hello world";
    String expectedOutput = "Hello world";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }
}
