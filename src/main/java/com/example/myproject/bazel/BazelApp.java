package com.example.myproject.bazel;

import com.google.common.primitives.Ints;

/**
 * This application compares two numbers, using the Ints.compare
 * method from Guava.
 */
public class BazelApp {

  public static int compare(int a, int b) {
    return Ints.compare(a, b);
  }

  public static void main(String... args) throws Exception {
    BazelApp bazelApp = new BazelApp();
    System.out.println("Success: " + bazelApp.compare(2, 2));
  }

}
