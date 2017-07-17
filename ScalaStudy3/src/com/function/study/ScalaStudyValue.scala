package com.function.study

import sun.applet.Main
/*
 * 值函数
 * Scala中函数也是对象，可以像变量一样被赋值
 * 这种函数被称为函数字面量或值函数
 */
object ScalaStudyValue {
  def main(args: Array[String]): Unit = {
   // 这里定义了一个没有名字的函数,将其赋值给变量sum
    //=>为函数映射符，将左边的类型转化为右边的类型
    //这里是将int类型转化为int类型
//    //这里(x:Int,y:Int)=>{
//      println(x+y)
//      x+y
//    }表达式称为Lambda表达式,值函数称为Lambda函数
    //值函数不能像普通函数那样指定返回值类型,编译器
    //会根据类型推导来确定函数返回值类型
    val sum=(x:Int,y:Int)=>{
      println(x+y)
      x+y
    }
  }
}