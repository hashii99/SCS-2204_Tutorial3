object Main {
  def main(args: Array[String]): Unit = {
    //Question 5 - calculate the total running time

    var total_time = easyPeace(2)+tempo(3)+easyPeace(2)
    println("Total Running Time = "+total_time)

    //answer => 53

  }

  def easyPeace(x:Int):Int = {
    return x*8
  }
  def tempo(x:Int):Int = {
    return x*7
  }

}