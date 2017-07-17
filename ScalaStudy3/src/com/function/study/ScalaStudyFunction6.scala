package com.function.study
/*
 * 下面这个是一个简单的柯里化例子
 * 当是(xxx,xxx)这种形式会被认为是多个参数
 * 当是(xxx)(xxx)这种形式会被认为是一个参数也就是柯里化
 */
object ScalaStudyFunction6 {
  def main(args: Array[String]) {
      val s1:String="Hello"
      val s2:String="Scala"
      println(combine(s1)(s2))
  }
  def combine(s1:String)(s2:String)={
    s1+s2
  }
}