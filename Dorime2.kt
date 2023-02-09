fun main()
{
    print("введите трехзначное число:")
    var x:Double = readLine()!!.toDouble()
    var x1:Double
    var x2:Double
    var x3:Double
    if(x>99.0&&x<1000.0)
    {
       x1=x%10.0
        x2=(x/10.0)%10.0
        x3=x/100.0
        when
        {
            (x1==x2&&x2==x3&&x3==x1)-> println("цифры одинаковы")
            else ->println("цифры разные")
        }
        
    }
    else println("число не трехзначное")
}