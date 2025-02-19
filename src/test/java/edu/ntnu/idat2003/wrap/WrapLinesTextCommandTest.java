package edu.ntnu.idat2003.wrap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

  @Test
  public void testExecuteWithEmptyInput() {
    // Create a WrapLinesTextCommand
    WrapLinesTextCommand command = new WrapLinesTextCommand("(", ")");

    // Execute the WrapLinesTextCommand with an empty input
    String input = "";
    String expectedOutput = "";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testExecuteWithNullInput() {
    // Create a WrapLinesTextCommand
    WrapLinesTextCommand command = new WrapLinesTextCommand("(", ")");

    // Execute the WrapLinesTextCommand with a null input
    String input = null;
    String expectedOutput = null;
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testEmptyParameters() {
    // Assert that an IllegalArgumentException is thrown when creating a WrapLinesTextCommand with
    // empty parameters
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new WrapLinesTextCommand("", "");
        });
  }

  @Test
  public void testNullParameters() {
    // Assert that an IllegalArgumentException is thrown when creating a WrapLinesTextCommand with
    // null parameters
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new WrapLinesTextCommand(null, null);
        });
  }
}
