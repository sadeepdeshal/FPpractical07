object Q3 {
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(n => 
      n > 1 && !(2 until n).exists(i => n % i == 0)
    )
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primeNumbers = filterPrime(inputList)
    println(primeNumbers.mkString(","))
  }
}
