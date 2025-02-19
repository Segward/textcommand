package edu.ntnu.idat2003.replace;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

  @Test
  public void testGetTarget() {
    // Create a ReplaceFirstTextCommand
    ReplaceTextCommand command = new ReplaceFirstTextCommand("world", "planet");

    // Execute the ReplaceFirstTextCommand with a sample input
    String expectedOutput = "world";
    String actualOutput = command.getTarget();

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testGetReplacement() {
    // Create a ReplaceFirstTextCommand
    ReplaceTextCommand command = new ReplaceFirstTextCommand("world", "planet");

    // Execute the ReplaceFirstTextCommand with a sample input
    String expectedOutput = "planet";
    String actualOutput = command.getReplacement();

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testExecuteWithEmptyInput() {
    // Create a ReplaceFirstTextCommand
    ReplaceTextCommand command = new ReplaceFirstTextCommand("world", "planet");

    // Execute the ReplaceFirstTextCommand with an empty input
    String input = "";
    String expectedOutput = "";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testExecuteWithNullInput() {
    // Create a ReplaceFirstTextCommand
    ReplaceTextCommand command = new ReplaceFirstTextCommand("world", "planet");

    // Execute the ReplaceFirstTextCommand with a null input
    String input = null;
    String expectedOutput = null;
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testEmptyParameters() {
    // Assert that an IllegalArgumentException is thrown when creating a ReplaceFirstTextCommand
    // with empty parameters
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new ReplaceFirstTextCommand("", "");
        });
  }

  @Test
  public void testNullParameters() {
    // Assert that an IllegalArgumentException is thrown when creating a ReplaceFirstTextCommand
    // with null parameters
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new ReplaceFirstTextCommand(null, null);
        });
  }
}
