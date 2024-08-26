object Q1{
  def filterEvenNumbers(lis : List[Int]) : List[Int] = {
    lis.filter(Num => Num % 2 == 0)
  }

  def main(args: Array[String]): Unit = {

    val numbers=List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val answer=filterEvenNumbers(numbers)

    println(answer.mkString("[", ", ", "]"))

  }

}
