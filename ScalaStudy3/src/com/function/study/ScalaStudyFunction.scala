package com.function.study

import sun.applet.Main
/*
 * scala具有类型推导功能，会根据最终的返回值
 * 推导函数的返回值类型，在实际函数定义中会省略函数的返回值
 * 类型推到有两个限制：
 * 如果需要return关键字指定返回值，则必须显示指定函数
 * 返回值类型
 * 另外一种函数中存在递归调用，则必须显示指定函数返回值类型
 */
object ScalaStudyFunction {
  def main(args: Array[String]): Unit = {
    
  }
  def sum(x:Int,y:Int)=x+y
}