package com.four.study
import scala.collection.mutable.ArrayBuffer
/*
 * 数组遍历的两种方式，索引遍历和直接数组遍历
 */
object ScalaStudyArray2 {
  def main(args: Array[String]): Unit = {
    //创建数字型缓冲数组
    var intArrayVar = ArrayBuffer(1, 1, 2)
    //转化为定长数组
    intArrayVar.toArray
    //索引遍历数组的方式
    for (i <- 0 to intArrayVar.length - 1)
      println(intArrayVar(i))
    for (i <- 0 until intArrayVar.length)
      println(intArrayVar(i))
    //步长为2的输出
    for (i <- 0 until (intArrayVar.length, 2))
      println(intArrayVar(i))
    //倒序输出
      for(i<-(0 until intArrayVar.length).reverse)
          println(intArrayVar(i))
    //数组方式
          for(i<-intArrayVar)
              println(intArrayVar(i))
              
  }
}