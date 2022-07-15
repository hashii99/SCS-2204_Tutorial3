object Main {
  def main(args: Array[String]): Unit = {

    //Question 4 - cost of books
    val final_cost = total_cost(60)
    println("Final Cost = "+final_cost)

    //Output => Final Cost = 1085.699999998

  }

  def CoverPrice(x: Int): Double = { //get the total cost for cover pages
    return x * 24.95
  }

  def discount(x: Int): Double = { //get discount for all copies
    return  CoverPrice(x)*0.4
  }
  def AfterReduceDiscount(x:Int):Double= {
    return CoverPrice(x)-discount(x)
  }

  def shippingCost(x: Int): Double = { //get the shipping cost
    //if(x<=50) x*3 else 50*3 + (x-50)*0.75
   if(x>50) {
      return x*3 + (x-50)*0.75
   } else {
     return  x*3
   }

  }
  def total_cost(x:Int):Double = {
    AfterReduceDiscount(x) + shippingCost(x)
  }

}
