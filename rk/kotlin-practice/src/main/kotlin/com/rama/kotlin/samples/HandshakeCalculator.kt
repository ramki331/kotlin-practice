package com.rama.kotlin.samples

enum class Signal(value: Int) {

  WINK(1), DOUBLE_BLINK(10), CLOSE_YOUR_EYES(100), JUMP(1000)
}

fun calculateHandshake(value: Int): List<Signal> {

  val binary = calculateBinary(value)

  var handshake : MutableList<Signal> = ArrayList(1)

  Signal.values().forEach {

//    when {
//      it.ordinal == binary -> handshake.add(it)
//      it.ordinal < binary
//          ->
//
//    }
    return handshake
  }

  val handshakes : List<Signal> = findHandshake(binary);


  return listOf(Signal.CLOSE_YOUR_EYES)
}

fun findHandshake(binary: Int): List<Signal> {

  var result : MutableList<Signal> = ArrayList()

  when {
//    binary == 1 -> result.add(Signal.WINK)
//    binary in 10..11 -> result.addAll(listOf(Signal.WINK, Signal.DOUBLE_BLINK))
//    binary in 100..111 ->
//    binary in 1000..1111 ->
//    binary in 10000..11111 ->
  }
  return result
}

fun calculateBinary(value: Int): Int {
  var result = ""
  result = binary(result, value)
  println(result.reversed())
  return when {
    Integer.parseInt(result) > 0 -> Integer.parseInt(result)
    else -> 0
  }
}

private fun binary(result: String, value: Int) : String{
  val temp = value.div(2)
  val rem = value.rem(2)
  var tempResult = result
  tempResult = tempResult.plus(rem)
  if (temp == 0) return tempResult
  return binary(
      result = tempResult,
      value = temp
  )

}
