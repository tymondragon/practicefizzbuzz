package com.practice.fizzbuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FizzBuzzTest {
  private final FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  @Test
  public void shouldReturnFizz() {
    assertEquals("Returns 'fizz'", fizzBuzz.fizzOrBuzz((byte) 3), "fizz");
  }

  @Test
    public void shouldReturnBuzz() {
    assertEquals("Returns 'buzz'", fizzBuzz.fizzOrBuzz((byte) 5), "buzz");
  }

  @Test
  public void shouldReturnFizzBuzz() {
    assertEquals("Returns 'fizzbuzz'", fizzBuzz.fizzOrBuzz((byte) 15), "fizzbuzz");
  }

  @Test
  public void shouldReturnNumber() {
    assertEquals("Returns '4'", fizzBuzz.fizzOrBuzz((byte) 4), "4");
  }

  @Test
  public void shouldReturnAStringofFizzBuzz() {
    assertEquals("Returns a concatenated string result", fizzBuzz.buildString(5), "1 2 fizz 4 buzz");
  }
}