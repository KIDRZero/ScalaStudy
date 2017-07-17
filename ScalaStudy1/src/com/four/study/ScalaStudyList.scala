package com.four.study
/*
 * 这里展示列表的创建
 */
object ScalaStudyList {
  def main(args: Array[String]): Unit = {
      val listStr=List("Hadoop","Hive","Spark")
  //上下两个效果是一样的
  val listStr2=List.apply("Spark","Hadoop","Flink")
 //创建数值型List
  val doubleList=List(1.0,2.0,3.0)
  //创建多重List，即List的元素为List
  val multiDList=List(List(1,2,3),List(4,5,6),List(7,8,9))
  for(i<-multiDList) 
    println(i)
  //采用::及Nil进行列表的构建
    //::的优先级是从右往左，两者等价
    val nume=1::(2::(3::(4::Nil)))
    val nums=1::2::3::4::Nil
    println(nume.isEmpty)
      //返回除第一个元素以外的其他元素组成的列表
       println(nume.tail)
       //取列表的第一个元素
        println(nume.head)
         println(nume.isEmpty)
         //取第二个元素
         println(nume.tail.head)
         //List的连接操作
         val mylist=List(1,2,3):::List(4,5,6)
         for(i<-0 to mylist.length-1) 
           println(mylist(i))
      
         
  }
}