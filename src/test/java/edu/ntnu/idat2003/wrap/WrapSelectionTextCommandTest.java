package edu.ntnu.idat2003.wrap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class WrapSelectionTextCommandTest {

  @Test
  public void testExecute() {
    // Create a WrapSelectionTextCommand
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("(", ")", "world");

    // Execute the WrapSelectionTextCommand with a sample input
    String input = "hello world";
    String expectedOutput = "hello (world)";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testGetTarget() {
    // Create a WrapSelectionTextCommand
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("(", ")", "world");

    // Execute the WrapSelectionTextCommand with a sample input
    String expectedOutput = "world";
    String actualOutput = command.getTarget();

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testExecuteWithEmptyInput() {
    // Create a WrapSelectionTextCommand
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("(", ")", "world");

    // Execute the WrapSelectionTextCommand with a sample input
    String input = "";
    String expectedOutput = "";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testExecuteWithNullInput() {
    // Create a WrapSelectionTextCommand
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("(", ")", "world");

    // Execute the WrapSelectionTextCommand with a null input
    String input = null;
    String expectedOutput = null;
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testEmptyParameters() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new WrapSelectionTextCommand("", "", "");
        });
  }

  @Test
  public void testNullParameters() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new WrapSelectionTextCommand(null, null, null);
        });
  }
}
