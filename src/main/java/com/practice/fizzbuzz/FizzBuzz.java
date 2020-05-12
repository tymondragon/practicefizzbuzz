package com.practice.fizzbuzz;

public class FizzBuzz {

  private int fizz;
  private int buzz;
  private int fizzbuzz;
  private int integer;
  private int lucky;

  public FizzBuzz() {
    this.fizz = 0;
    this.buzz = 0;
    this.fizzbuzz = 0;
    this.integer = 0;
  }

  public String buildString(int number) {
    StringBuilder fizzBuzzString = new StringBuilder();
    for (int i = 1; i <= number; i++) {
      fizzBuzzString.append(fizzOrBuzz(i)).append(' ');
    }
    return fizzBuzzString.toString().trim();
  }

  public String fizzOrBuzz(int indexedNumber) {
    String value;
    if (Integer.toString(indexedNumber).contains("3")) {
      value = "lucky";
      this.lucky++;
    }
    else if (indexedNumber % 3 == 0 && indexedNumber % 5 == 0) {
      value = "fizzbuzz";
      this.fizzbuzz++;
    }
    else if (indexedNumber % 3 == 0) {
      value = "fizz";
      this.fizz++;
    }
    else if (indexedNumber % 5 == 0) {
      value = "buzz";
      this.buzz++;
    }
    else {
      value = Integer.toString(indexedNumber);
      this.integer++;
    }
    return value;
  }

  public int getFizz() { return this.fizz; }
  public int getBuzz() { return this.buzz; }
  public int getFizzbuzz() { return this.fizzbuzz; }
  public int getInteger() { return this.integer; }
  public int getLucky() { return this.lucky; }
}