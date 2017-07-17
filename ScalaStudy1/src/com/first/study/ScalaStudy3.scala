package com.first.study
/*
 * 1.用'表示scala中的符号类型
 * 该类型主要起标识作用，
 * 在模式匹配，内容判断中比较常用
 * 2.符号类型用==进行比较，比较的是内容
 * 与String类型与元组类型的比较方式一样
 */
object ScalaStudy3 {
  def main(args: Array[String]): Unit = {
    val s='start
    val s2:Symbol='stop
    val s3='stop
    println(s2==s3)
  }
}