package com.four.study

object ScalaStudyQueue {
  def main(args: Array[String]): Unit = {
    var queue=scala.collection.immutable.Queue(1,2,3)
    println(queue.dequeue)//出队
    println(queue.enqueue(4))//入队
    var q2=scala.collection.mutable.Queue(1,2,3,4,5)
    q2+=5//入队操作
    q2++=List(6,7,8)//集合方式
    
  }
}