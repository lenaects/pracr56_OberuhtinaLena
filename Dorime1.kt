fun main()
{
    print("введите x:")
    var x:Double = readLine()!!.toDouble()
    var f:Double
    if(x<=7) f=(3.0*x)-9
    else f=1/(x.pow(2)-7)
    println("ответ: $f")
}