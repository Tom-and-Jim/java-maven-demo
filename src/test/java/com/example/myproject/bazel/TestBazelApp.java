package com.example.myproject.bazel;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Tests for correct dependency retrieval with maven rules.
 */
public class TestBazelApp {

  @Test
  public void testCompare() throws Exception {
    BazelApp app = new BazelApp();
    assertEquals("should return 0 when both numbers are equal", 0, app.compare(1, 1));
  }
}
