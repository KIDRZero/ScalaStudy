package com.four.study
import scala.collection.mutable
/*
 * 1.Scala中默认使用的是immutable集合，即
 * 该集合一旦被创建便不可被修改，如果修改那么返回的
 * 是新的集合，原集合不变
 * 2.如果想要创建mutable集合，需要进行相关引入
 * 不引入任何包时，用Set创建的是immutable
 */
object ScalaStudy1 {
  def main(args: Array[String]): Unit = {
    val mutableSet=mutable.Set(1,2,3)
    val multableSet=Set(1,2,3)
  }
}