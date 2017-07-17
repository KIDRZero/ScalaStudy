package com.four.study
/*
 * 初始化map，以元组的形式("xxx",xx)
 */
object ScalaStudyMap2 {
  def main(args: Array[String]): Unit = {
    val m1=new scala.collection.mutable.HashMap[String,Int]()
    m1.put("Hadoop", 1)
    println(m1)
    println(m1.contains("Hadoop"))
    val m2=scala.collection.mutable.Map(("scala",4),("hbase",3))
    println(m2)
    println( m2.get("scala"))//如果存在指定的key，获取指定的value
    println(m2.get("xxx"))
  }
}