package com.four.study



/*
 * Scala中的Map，左边是key，右边是value
 * 这里介绍了三种Map方式
 */
object ScalaStudyMap {
  def main(args: Array[String]): Unit = {
    val s1=Map("john"->21,"stephen"->22,"luck"->20)
    //s1.clear(); 默认创建的是不可变Map，没有clear方法
    //下面这种创建的是可变的Map，有clear方法
    val s2=scala.collection.mutable.Map("john"->21,"stephen"->22,"luck"->20)
    s2.clear();
    for(i<-s1) println(i)
    
    s1.foreach(e=>{val(k,v)=e;println(k+":"+v)}
    
    
  )
   s1.foreach(e=>println(e._1+":"+e._2))
  }
}