package com.function.study
/*
 * 这里演示了一下创建部分函数的方式
 * 其中s1,s2,s3分别代表了不指定任何参数，指定两个参数，
 * 指定一个参数的部分应用函数，当指定的某些参数变为固定值，
 * 未确定的那个用_:来表示，这样当你调用部分应用函数时，
 * 只需要指定缺席的那个参数的值即可
 */
object ScalaStudyFunction3 {
  def main(args: Array[String]): Unit = {
    
  }
  def sum(x:Int,y:Int,z:Int)=x+y+z
  val s1=sum _
  println(s1(1,2,3))
  val s2=sum(1,_:Int,3)
  println(s2(2))
  val s3=sum(1,_:Int,_:Int)
  println(s3(2,3))
}