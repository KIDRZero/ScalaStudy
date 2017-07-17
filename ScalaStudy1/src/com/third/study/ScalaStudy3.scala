package com.third.study
/*
 * if语句可以做表达式，该表达式的返回值可以赋值给变量
 * scala会将if语句的最后一条执行语句作为返回值
 */
object ScalaStudy3 {
  def main(args: Array[String]): Unit = {
     val w=if("hello"=="hell") 1 else 0
  val z=if("hello"=="hell") println("1") else println("0")
  }
}