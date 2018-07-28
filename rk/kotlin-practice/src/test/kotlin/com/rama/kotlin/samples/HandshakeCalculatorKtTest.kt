package com.rama.kotlin.samples

import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Ignore

class HandshakeCalculatorTest {

  @Test
  fun testThatInput1YieldsAWink() {
    assertEquals(
        listOf(Signal.WINK),
        calculateHandshake(13))
  }

  @Ignore
  @Test
  fun testThatInput2YieldsADoubleBlink() {
    assertEquals(
        listOf(Signal.DOUBLE_BLINK),
        calculateHandshake(2))
  }

  @Ignore
  @Test
  fun testThatInput4YieldsACloseYourEyes() {
    assertEquals(
        listOf(Signal.CLOSE_YOUR_EYES),
        calculateHandshake(4))
  }

  @Ignore
  @Test
  fun testThatInput8YieldsAJump() {
    assertEquals(
        listOf(Signal.JUMP),
        calculateHandshake(8))
  }

  @Ignore
  @Test
  fun testAnInputThatYieldsTwoActions() {
    assertEquals(
        listOf(Signal.WINK, Signal.DOUBLE_BLINK),
        calculateHandshake(3))
  }

  @Ignore
  @Test
  fun testAnInputThatYieldsTwoReversedActions() {
    assertEquals(
        listOf(Signal.DOUBLE_BLINK, Signal.WINK),
        calculateHandshake(19))
  }

  @Ignore
  @Test
  fun testReversingASingleActionYieldsTheSameAction() {
    assertEquals(
        listOf(Signal.JUMP),
        calculateHandshake(24))
  }

  @Ignore
  @Test
  fun testReversingNoActionsYieldsNoActions() {
    assertEquals(
        emptyList<Signal>(),
        calculateHandshake(16))
  }

  @Ignore
  @Test
  fun testInputThatYieldsAllActions() {
    assertEquals(
        listOf(Signal.WINK, Signal.DOUBLE_BLINK, Signal.CLOSE_YOUR_EYES, Signal.JUMP),
        calculateHandshake(15))
  }

  @Ignore
  @Test
  fun testInputThatYieldsAllActionsReversed() {
    assertEquals(
        listOf(Signal.JUMP, Signal.CLOSE_YOUR_EYES, Signal.DOUBLE_BLINK, Signal.WINK),
        calculateHandshake(31))
  }

  @Ignore
  @Test
  fun testThatInput0YieldsNoActions() {
    assertEquals(
        emptyList<Signal>(),
        calculateHandshake(0))
  }

  @Ignore
  @Test
  fun testThatInputWithLower5BitsNotSetYieldsNoActions() {
    assertEquals(
        emptyList<Signal>(),
        calculateHandshake(32))
  }

}