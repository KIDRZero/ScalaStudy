package com.four.study
/*
 * 创建一个长度为10的int数组和string数组
 * 默认值为0和null
 * 用val修饰，说明数组不可变，但是数组中的内容可以修改
 * 这里展示了两种创建数组的方式，一种是通过new的方式创建，
 * 这种方式创建不需要开始指定数组元素的值
 * 另外一种方式是通过s2这种方式，创建数组的同时对数组元素进行赋值
 * 这里创建的都是定长数组
 */
object ScalaStudyArray {
  def main(args: Array[String]): Unit = {
    val nArray=new Array[Int](10)
    val strArray=new Array[String](10)
    strArray(0)="hello"
    val s2=Array("Hello","Thanks")
    nArray.toBuffer
  }
}