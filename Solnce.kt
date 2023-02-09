fun main()
{
    print("введите первое число:")
    var a:Double = readLine()!!.toDouble()
    print("введите второе число:")
    var b:Double= readLine()!!.toDouble()
    when
    {
        (a>b) ->  println("${a+1} первое число больше второго")
        (a<b)->println("${b+1} второе число больше первого")
        (a==b)->println("${Math.pow(a,3.0)} числа равны")
        else ->println("неопределенное значение")

    }
}