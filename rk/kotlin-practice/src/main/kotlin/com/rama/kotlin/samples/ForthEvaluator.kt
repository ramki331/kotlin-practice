package com.rama.kotlin.samples

import java.util.Stack

class ForthEvaluator {
  fun evaluateProgram(listOf: List<String>): List<Any> {

    var stack: Stack<Int> = Stack()
    var newOperators : Map<String, String> = HashMap()


    listOf.forEach {
      if(hasNewWords(it)) {
        //it.substringAfter()
        var tokens = it.split(" ")
        //newOperators.plus(Pair(tokens.get(0), ))
        //it.split(" ").associate { Pair(this[0], ) }
      } else {
        it.split(" ").forEach {
          when {
            it.toIntOrNull() != null -> stack.push(Integer.parseInt(it))
          //TODO write extension functions on stack
            it == "+" -> add(stack)
            it == "-" -> subtract(stack)
            it == "*" -> multiply(stack)
            it == "/" -> divide(stack)
            it.equals("DUP", ignoreCase = true) -> duplicate(stack)
            it.equals("drop", ignoreCase = true) -> drop(stack)
            it.equals("swap", ignoreCase = true) -> stack.swapvalues()
            it.equals("over", ignoreCase = true) -> stack.copyover()
          }
        }
      }
    }

    if (stack.isEmpty()) {
      return emptyList()
    }
    return stack
  }

  private fun hasNewWords(it: String): Boolean {
    return it.startsWith(":") && it.endsWith(";")
  }

  fun Stack<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
  }

  fun Stack<Int>.swapvalues() {
    this.apply {
      require(this.size > 1) {
        "Swapping requires that the stack contain at least 2 values"
      }
      swap((size-1), (size-2))
    }
  }

  fun Stack<Int>.copyover() {
    require(this.size > 1) {
      "Overing requires that the stack contain at least 2 values"
    }
    apply {
      push(this[size - 2])
    }
  }

  private fun drop(stack: Stack<Int>) {
    require(stack.size > 0) {
      "Dropping requires that the stack contain at least 1 value"
    }
    stack.pop()
  }

  private fun duplicate(stack: Stack<Int>) {
    require(stack.size > 0) {
      "Duplicating requires that the stack contain at least 1 value"
    }
    stack.run {  push(peek())}
  }

  fun add(stack: Stack<Int>) {
    require(stack.size > 1) {
      "Addition requires that the stack contain at least 2 values"
    }
    stack.apply {
      push(pop() + pop())
    }
  }

  fun subtract(stack: Stack<Int>) {
    require(stack.size > 1) {
      "Subtraction requires that the stack contain at least 2 values"
    }
    stack.apply {
      val last = stack.pop()
      val first = stack.pop()
      push(first - last)
    }
  }

  fun multiply(stack: Stack<Int>) {
    require(stack.size > 1) {
      "Multiplication requires that the stack contain at least 2 values"
    }
    stack.apply {
      push(pop() * pop())
    }
  }

  fun divide(stack: Stack<Int>) {
    require(stack.size > 1) {
      "Division requires that the stack contain at least 2 values"
    }
    require(stack.peek() != 0) {
      "Division by 0 is not allowed"
    }
    stack.apply {
      val last = stack.pop()
      val first = stack.pop()
      push(first/last)
    }
  }

}