package edu.ntnu.idat2003.wrap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

  @Test
  public void testGetPrefix() {
    // Create a WrapTextCommand
    WrapTextCommand command = new WrapTextCommand("(", ")");

    // Execute the WrapTextCommand with a sample input
    String expectedOutput = "(";
    String actualOutput = command.getPrefix();

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testGetSuffix() {
    // Create a WrapTextCommand
    WrapTextCommand command = new WrapTextCommand("(", ")");

    // Execute the WrapTextCommand with a sample input
    String expectedOutput = ")";
    String actualOutput = command.getSuffix();

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testExecuteWithEmptyInput() {
    // Create a WrapTextCommand
    WrapTextCommand command = new WrapTextCommand("(", ")");

    // Execute the WrapTextCommand with an empty input
    String input = "";
    String expectedOutput = "";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testExecuteWithNullInput() {
    // Create a WrapTextCommand
    WrapTextCommand command = new WrapTextCommand("(", ")");

    // Execute the WrapTextCommand with a null input
    String input = null;
    String expectedOutput = null;
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testEmptyParameters() {
    // Assert that an IllegalArgumentException is thrown when creating a WrapTextCommand with
    // empty parameters
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new WrapTextCommand("", "");
        });
  }

  @Test
  public void testNullParameters() {
    // Assert that an IllegalArgumentException is thrown when creating a WrapTextCommand with
    // null parameters
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new WrapTextCommand(null, null);
        });
  }
}
