package com.rama.kotlin.samples

fun sum3(set: Set<Int>, number: Int) : Int {
  require(number > 0)
  var sum : Int = 0;
  set.forEach { value ->
    for (i in 1..(number-1)) {
      when
      {
        isDivisor(i, value) -> sum += i
      }
    }
  }
  return sum;
}

fun sum2(set: Set<Int>, number: Int) : Int {
  require(number > 0)
  var sum  = 0
  val resultSet = HashSet<Int>(2)
  set.forEach({ value ->
    for (i in 1..(number - 1)) when {
      isDivisor(i, value) -> resultSet.add(i)
    }
  })
  resultSet.forEach { result -> sum += result }
  return sum;
}


fun sum(set: Set<Int>, number: Int) : Int {
  require(number > 0)
  var sum  = 0
  val resultSet = HashSet<Int>(2)
  set.forEach ({
    value -> for (i in 0..(number-1)) {
    when {
      isDivisor(i, value) -> resultSet.add(i)
    }
  }
  })
  resultSet.map { sum += it }

  return sum;
}

fun isDivisor(number1: Int, number2: Int) : Boolean {
  return when {
    number1.rem(number2) == 0 -> true
    else -> false
  }
}

