package com.function.study
/*
 * 这里测试了一个简单的闭包的例子
 * 所谓闭包，简单来说就是定义了一个函数，这个函数的返回值依赖于函数之外的一个或者多个变量值
 * 在这里定义了一个闭包函数，他引用了函数之外的一个变量test
 * 也就是说这个函数捕获了一个外部变量形成一个封闭的函数，这就是闭包
 * 这里定义了一个匿名函数
 * 使用lazy关键字修饰函数字面量，当真正使用
 * 该变量的时候，函数才会被创建
 */
object ScalaBiBao {
   def main(args: Array[String]): Unit = {
    println(mix(5))
    println(mix(10))
    println(w(10))
    println(f(10))
   }
    var test=10
   val mix=(x:Int)=>x*test
   var k=10
   var w=(x:Int)=>x+k
   lazy val f=(x:Double)=>x*2
}