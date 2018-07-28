package com.rama.kotlin.samples
import org.junit.Ignore
import org.junit.Test
import org.junit.Assert.assertEquals


class SumOfMultiplesTest {

  @Test
  fun `multiples of 3 or 5 up to 1`() {
    assertEquals(0, sum(setOf(3, 5), 1))
  }

  @Test
  fun `multiples of 3 or 5 up to 4`() {
    assertEquals(3, sum(setOf(3, 5), 4))
  }

  @Test
  fun `multiples of 3 up to 7`() {
    assertEquals(9, sum(setOf(3), 7))
  }

  @Test
  fun `multiples of 3 or 5 up to 10`() {
    assertEquals(23, sum(setOf(3, 5), 10))
  }

  @Test
  fun `multiples of 3 or 5 up to 100`() {
    assertEquals(2318, sum(setOf(3, 5), 100))
  }

  @Test
  fun `multiples of 3 or 5 up to 1000`() {
    assertEquals(233168, sum(setOf(3, 5), 1000))
  }

  @Test
  fun `multiples of 7, 13 or 17 up to 20`() {
    assertEquals(51, sum(setOf(7, 13, 17), 20))
  }

  @Test
  fun `multiples of 4 or 6 up to 15`() {
    assertEquals(30, sum(setOf(4, 6), 15))
  }

  @Test
  fun `multiples of 5, 6 or 8 up to 150`() {
    assertEquals(4419, sum(setOf(5, 6, 8), 150))
  }

  @Test
  fun `multiples of 5 or 25 up to 51`() {
    assertEquals(275, sum(setOf(5, 25), 51))
  }

  @Test
  fun `multiples of 43 or 47 up to 10000`() {
    assertEquals(2203160, sum(setOf(43, 47), 10000))
  }

  @Test
  fun `multiples of 1 up to 100`() {
    assertEquals(4950, sum(setOf(1), 100))
  }

  @Test
  fun `multiples of an empty set up to 10000`() {
    assertEquals(0, sum(emptySet(), 10000))
  }

}