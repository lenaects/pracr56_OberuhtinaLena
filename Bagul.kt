fun main()
{
    print("введите число от 0 до 9:")
    var a:Double = readLine()!!.toDouble()
    when
    {
        (a==0.0)-> println("ноль")
        (a==1.0)-> println("один")
        (a==2.0)-> println("два")
        (a==3.0)-> println("три")
        (a==4.0)-> println("четыре")
        (a==5.0)-> println("пять")
        (a==6.0)-> println("шесть")
        (a==7.0)-> println("семь")
        (a==8.0)-> println("восемь")
        (a==9.0)-> println("девять")
        (0.0>a||a>9.0)->println("число не входит в диапозон")

    }
}
