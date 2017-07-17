package com.first.study
/*
 * 1
 * scala会默认引入java.lang包
 * 2
 * Scala定义变量时必须要进行初始化
 * 可以用占位符_进行初始化
 * 3
 * lazy只可以用来修饰val，此时
 * 定义该变量过程中不会被赋值
 * 只有在使用时才会被赋值
 * 4
 * val 为不可变变量
 * var 为可变变量
 * 5
 * Scala中基本数据类型与Java基本数据类型对应，区别
 * 是前者的首字母大写，因为Scala中所有
 * 值类型都是对象
 * 6
 * 默认浮点类型是double类型，
 * 加上f转化为单浮点类型
 * 7.
 * 特殊符号加转义符\
 * char1表示双引号
 * 8.字符串本身带有双引号，加转义符
 * 或者原样输出用“““
 * 9
 * Scala定义变量不需要特别指定类型，会自动识别
 */
object HelloScalla {
  def main(args: Array[String]): Unit = {
     println("Hello Scala")
     val helloString="hello"
     val helloString2:String="hello"
     var ln="Hello World"
     val v1="test"
     lazy val v2="test"
     println(v2)
     val f1=3.14
     val f2=3.14f
     println(0.33e1)
     var char1='\"'
     val s1="\"Hello Hello\""
     val s2="""Hello Hello \s\sd\s\d\wf"""
     println(s2)
     val b1:Boolean=true
     var b2=false;
  }
}