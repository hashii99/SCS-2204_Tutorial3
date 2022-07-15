object Main {
  def main(args: Array[String]): Unit = {

    //Question 2 - Convert temperature
    println("Temperature (F) = "+ConvertTemp(35))

    //95.0
  }


  def ConvertTemp(x:Int):Double = {
    return (x*1.8000+32.00)
  }

}