package com.function.study
/*
 * 高阶函数定义：
 * 如果一个函数的输入参数也是个函数类型，那么这个函数就是高阶
 * 函数
 * 定义一个高阶函数，该函数的输入参数是函数类型
 * (f:(Double)=>Double)=f(100)
 * 这里定义了一个函数sqrt，输入和输出类型均为double
 * 这样就可以将这个函数作为之前创建的高阶函数的参数传递进去了
 * 
 * 定义了一个高阶函数h2，接受一个int类型，返回值为函数类型的
 * Double=>Double,这个返回的函数类型输入参数为double，输出为double
 * 函数体 (x:Double)=>factor*x表示为该函数的返回值
 */
object ScalaStudyFunction8 {
  def main(args: Array[String]): Unit = {
    
  }
  def highFunction(f:(Double)=>Double)=f(100)
  def sqrt(x:Double)=Math.sqrt(x)
  def high2(factor:Int):Double=>Double={
    println("返回新的函数")
    (x:Double)=>factor*x
  }
}