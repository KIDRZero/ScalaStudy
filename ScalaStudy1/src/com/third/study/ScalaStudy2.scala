package com.third.study

import sun.applet.Main
/*
 * if语句的嵌套
 */
object ScalaStudy2 {
  def main(args: Array[String]): Unit = {
     val x = 9
  if (x < 10)
    if (x == 9)
      println("9")
    else
      println("other")
  else
    println("biggger than 9")
  }
 
}