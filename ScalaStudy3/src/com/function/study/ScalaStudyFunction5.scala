package com.function.study
/*
 * 函数柯里化
 * 意思就是一个函数本来是接受两个参数
 * 现在将其改造成接受一个参数的函数
 * 而且这个新函数的返回值类型与原来的两个
 * 参数的第二个参数的返回值类型一致
 * 像add2就是add的柯里化，这种形式就是调用了1个参数
 * 这个add(1)(2)实际上是变成了def add(x:Int)=(y:Int)=>x+y
 * 这个函数的意思是接受一个x为参数，返回一个匿名函数
 * 而该匿名函数是接受一个int类型参数y，
 * 函数体的内容是x+y
 * 因为这里x为1，那么实际表示的函数就是
 * (y:Int)=>1+y
 */
object ScalaStudyFunction5 {
  def main(args: Array[String]): Unit = {
    println(add(1,2))
    println(add2(1)(2))
  }
  def add(x:Int,y:Int)=x+y
  def add2(x:Int)(y:Int)=x+y
}