package com.four.study
import scala.collection.mutable.ArrayBuffer
/*
 * 这里创建了一个变长数组，
 * 通过ArrayBuffer创建变长数组
 * 之后调用toArray方法变为定长数组
 * 可以在尾部追加元素，也可以跟多个元素的集合
 * ++=用来向数组中追加内容，右侧可以是任意集合
 * trimEnd用来删除末尾n个元素
 * 变长数组调用toArray方法转化为定长数组
 * 定长数组调用toBuffer方法转化为变长数组
 * 这里进行了数组的循环输出
 */
object ScalaStudyArrayBuffer {
  def main(args: Array[String]): Unit = {
    println("创建字符串类型的缓冲数组")
    val s1=ArrayBuffer[String]()
    s1+="Hello"
    s1+=("World","Programmer")
    s1++=Array("Welcome","To","Scala")
    s1++=List("Welcome","To","Scala")
    s1.trimEnd(3)
    for(i<-0 to s1.length-1) 
      println(s1(i))
    println("创建int类型的缓冲数组")
    val intArray=ArrayBuffer(1,1,2)
    intArray.insert(0,6)
    intArray.insert(0,7,8,9)
    intArray.remove(0,3)//从0开始，删除四个元素
    intArray.toArray
    println("数组的遍历")
    for(i<-0 to intArray.length-1)
      println(intArray(i))
  }
}