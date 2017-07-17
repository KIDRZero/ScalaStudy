package com.four.study
import scala.collection.mutable.Stack
import sun.applet.Main

object ScalaStudyStack {
  def main(args: Array[String]): Unit = {
    val stack = new Stack[Int]

    val s2 = Stack(1, 2, 3)

    println(s2.top) //出栈

    s2.push(1)

    s2.push(2)

    s2.top

    println(stack)
  }
}