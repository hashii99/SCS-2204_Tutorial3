object Main {
  def main(args: Array[String]): Unit = {

    //Question 1 - Area of a disk
    println("Area of disk = "+AreaOfDisk(5))

  //output => Area of disk = 78.53981633974483

  }
 
  def AreaOfDisk(r:Int):Double = {
    return (math.Pi * r * r)
  }



}
