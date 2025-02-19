package edu.ntnu.idat2003.capitalize;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.lang.IllegalArgumentException;

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

  @Test
  public void testExecuteWithEmptyInput() {
    // Create a CapitalizeTextCommand
    CapitalizeTextCommand command = new CapitalizeTextCommand();

    // Execute the CapitalizeTextCommand with an empty input
    String input = "";
    String expectedOutput = "";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testExecuteWithNullInput() {
    // Create a CapitalizeTextCommand
    CapitalizeTextCommand command = new CapitalizeTextCommand();

    // Execute the CapitalizeTextCommand with a null input
    String input = null;
    String expectedOutput = null;
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }
}
