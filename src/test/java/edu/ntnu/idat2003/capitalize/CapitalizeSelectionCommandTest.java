package edu.ntnu.idat2003.capitalize;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CapitalizeSelectionCommandTest {

  @Test
  public void testExecute() {
    // Create a CapitalizeSelectionTextCommand
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("world");

    // Execute the CapitalizeSelectionTextCommand with a sample input
    String input = "hello world";
    String expectedOutput = "hello World";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testGetTarget() {
    // Create a CapitalizeSelectionTextCommand
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("world");

    // Execute the CapitalizeSelectionTextCommand with a sample input
    String expectedOutput = "world";
    String actualOutput = command.getTarget();

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testExecuteWithEmptyInput() {
    // Create a CapitalizeSelectionTextCommand
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("world");

    // Execute the CapitalizeSelectionTextCommand with a sample input
    String input = "";
    String expectedOutput = "";
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testExecuteWithNullInput() {
    // Create a CapitalizeSelectionTextCommand
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("world");

    // Execute the CapitalizeSelectionTextCommand with a sample input
    String input = null;
    String expectedOutput = null;
    String actualOutput = command.execute(input);

    // Assert the output
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testEmptyParameters() {
    // Assert that an IllegalArgumentException is thrown when creating a
    // CapitalizeSelectionTextCommand with an empty target
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new CapitalizeSelectionTextCommand("");
        });
  }

  @Test
  public void testNullParameters() {
    // Assert that an IllegalArgumentException is thrown when creating a
    // CapitalizeSelectionTextCommand with a null target
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new CapitalizeSelectionTextCommand(null);
        });
  }
}
