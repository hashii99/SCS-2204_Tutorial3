object Main {
  def main(args: Array[String]): Unit = {
    //Question 3 - Volume of sphere
    println("Volume of sphere = "+VolumeOfSphere(5))

      //392.69908169872417
  }


  def VolumeOfSphere(r:Int):Double = {
    return (4/3 * math.Pi * r * r * r)
  }

}