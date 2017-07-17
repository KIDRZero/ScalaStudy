package com.four.study
import scala.collection.mutable.Set
object ScalaStudySet {
  def main(args: Array[String]): Unit = {
    //定义一个mutable集合
    val numSet=Set(3.0,5)
    numSet+6
    for(i<-numSet) println(i)
    
    val linkedHashSet=scala.collection.mutable.LinkedHashSet(3.0,5)
    linkedHashSet.+=(6)
    for(i<-linkedHashSet) println(i)
  }
}