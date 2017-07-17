package com.function.study
/*
 * Scala中的数组可以通过foreach方法将其打印
 * 也可以定义一个方法，之后调用该方法
 * 这里定义了一个print的部分函数p
 * 所谓部分函数就是一个函数有多个参数
 * 但是使用的时候只提供部分函数，这里_是部分函数的定义符，不是普通的下划线
 */
object ScalaStudyFunction2 {
  def main(args: Array[String]): Unit = {
    Array("Hadoop","Hive","Spark")foreach(x=>println(x))
    Array("Hadoop","Hive","Spark")foreach(print)
    val p=print _
    Array("Hadoop","Hive","Spark")foreach(p)
    Array("Hadoop","Hive","Spark")foreach(print _)
  }
  def print(x:String)=println(x)
}