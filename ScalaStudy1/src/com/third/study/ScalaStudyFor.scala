package com.third.study
/*
 * ->是生成器，for循环遍历实质是对集合的遍历来实现的
 * to是右闭，until是右开
 * 可以设置两个参数，第二个参数是步长
 */
object ScalaStudyFor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {
      println("i=" + i)
    }
    println("========华丽的分隔符============")
    for (i <- 1 to (11, 2)) {
      println("i=" + i)
    }
    println("========华丽的分隔符============")
    for (i <- 1 until 5) {
      println("i=" + i)
    }
    println("========华丽的分隔符============")
    for (i <- 1 until (11, 2)) {
      println("i=" + i)
    }
  }
}