package com.third.study
/*
 * Scala中while与dowhile的返回值均为Unit
 * Scala不是纯函数式编程语言
 */
object ScalaStudyWhile {
  def main(args: Array[String]): Unit = {
    var i=15;
    while(i<20){
      println("i="+i)
      i=i+1
    }
    var j=15
    do{
      println("i="+i)
      i=i+1
    }while(i<20)
  }
}