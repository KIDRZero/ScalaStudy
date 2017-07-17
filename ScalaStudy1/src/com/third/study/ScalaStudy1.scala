package com.third.study

object ScalaStudy1 {
  def main(args: Array[String]): Unit = {
    val x = 8
    if (x < 10)
      println(s"$x is smaller than 10")
    val y = 9
    if (x < 8)
      println("small")
    else
      println("big")
    val z = 10
    if (z == 8)
      println(8)
    else if (z == 9)
      println(9)
    else if (z == 10)
      println(10)
  }
}