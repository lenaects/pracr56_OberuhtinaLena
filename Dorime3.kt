fun main() {
    print("введите a прямоугольного отверстия:")
    var a: Double = readLine()!!.toDouble()
    print ("введите b прямоугольного отверстия:")
    var b: Double = readLine()!!.toDouble()
    print("введите ребро x:")
    var x: Double = readLine()!!.toDouble()
    print("введите ребро y:")
    var y: Double = readLine()!!.toDouble()
    print("введите ребро z:")
    var z: Double = readLine()!!.toDouble()
    when
    {
        (a<=x&&b<=y)->  println("кирпичь пройдет через отверстие")
        else->  println("кирпичь не пройдет через отверстие")
    }

}