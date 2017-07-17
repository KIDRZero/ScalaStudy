package com.first.study

import sun.applet.Main
/*
 * 1.Scala中写代码不需要加分号
 * 2.Scala中对象比较的是内容
 * 3.调用eq方法比较的是引用地址
 * 4.同一优先级，从左到右，先取模再乘除
 * 5.Scala中有一种类型为元组，可以将不同数据类型的值放入
 * 一个变量中保存
 * 6.元组中的数据可以通过._索引的格式来访问
 * 7.可以通过模式匹配的方式来获取元组中的内容
 *   val (kkk,second,third)=tuple
 * 8.元组比较，用==进行比较，比较的是内容
 */
object ScalStudy2 {
  def main(args: Array[String]): Unit = {
    val sum=1+2
    val sum2=(1).+(2)
    val sum3=1+2L
    println(1==1)
     println(1==1.0)
     val x="Hello"
     val y="Hello"
     println(x==y)
     var x1=new String("hello")
    var y1=new String("hello")
    println(x1.equals(y1))
     println(x1==y1)
     println(x1.eq(y1))
     var str="Hello"
     println(str.indexOf("o")+" "+str toUpperCase)
     println(str toLowerCase)
     println(str.reverse)
     println(str.drop(3))
     println(str slice(1,4))
     println(10%2*3)
     println("hello","china",1)
     var tuple=("Hello","China",1)
     println(tuple._1+" "+tuple._2+" "+tuple._3)
     val (kkk,second,third)=tuple
     println(kkk)
     println(second)
      println(third)
       var tuple2=("Hello","China",1)
       println(tuple==tuple2)
  }
}