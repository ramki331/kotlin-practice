package com.rama.kotlin.samples

enum class Classification {
  PERFECT, ABUNDANT, DEFICIENT
}

//fun classify(number: Int): Classification {
//  require(number > 0)
//  val temp = number / 2;
//
//  var sum = 0
//  for (i in 1..temp) {
//    if (number.rem(i) == 0) {
//      sum += i
//    }
//  }
//  return when {
//    sum == number -> Classification.PERFECT
//    sum > number -> Classification.ABUNDANT
//    else -> Classification.DEFICIENT
//  }
//}

fun classify(number: Int): Classification {
  require(number > 0)
  val temp = number / 2

  val sum = (1..temp)
      .filter({ number.rem(it) == 0 })
      .sum()

  return when {
    sum == number -> Classification.PERFECT
    sum > number -> Classification.ABUNDANT
    else -> Classification.DEFICIENT
  }
}