package FP_Prac08

object Q3 {

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val isPrime = (num: Int) => {
      if (num <= 1) false
      else if (num == 2) true
      else if (num % 2 == 0) false
      else !(3 to Math.sqrt(num).toInt by 2).exists(num % _ == 0)
    }

    val primeNumbers = numbers.filter(isPrime)
    
    println(s"Prime numbers: ${primeNumbers.mkString(", ")}")
  }
}