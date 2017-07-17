package com.third.study
import scala.util.control.Breaks._
/*
 * Scala中没有提供break continue关键字
 * 通过引入上面这个类，调用该类的breakable方法来实现break方法
 * 这里break和breakable都是上面引入类的方法
 * 下面两种是提前终止循环的方法，可以在for循环中添加if判断来终止循环
 * 
 * for与yield一起使用作为表达式，可以将前面for循环的输出
 * 作为缓存的值生成一个集合返回
 * yield
 * 
 * Scala中if和while具有表达式特点，有返回值
 * while循环有返回值，但是返回值为Unit类
 */
object ScalaStudyBreak {
  def main(args: Array[String]): Unit = {
    breakable {
      for (i <- 1 to 5) {
        if (i > 2) break
        println("i=" + i)
      }
    }
    for (i <- 1 to 5 if (i < 3)) {
      println("i=" + i)
    }
    for (i <- 1 to 5 if (i > 3)) {
      for (j <- 5 to 7 if (j == 6)) {
        println("i=" + i + ",j=" + j)
      }
    }
    println("=============华丽的分割线=======")
    
    println(for (i <- 1 to 5) yield i)

    println(for (i <- 1 to 5) yield i / 2)

    println(for (i <- 1 to 5) yield i % 2 == 0)
  }
}