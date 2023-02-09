fun main()
{
    print("введите возраст:")
    var a:Double = readLine()!!.toDouble()
    when(a)
    {
        in 0.0..2.0->println("маладенец")
        in 3.0..12.0->println("ребенок")
        in 12.0..15.0->println("подросток")
        in 16.0..21.0->println("юношеский")
        in 22.0..20.0->println("зрелый")
        in 61.0..75.0->println("пожилой")
        in 76.0..90.0->println("старческий")
        in 91.0..110.0->println("долгожитель")
        !in 0.0..110.0 -> println("не может быть таково возраста")
        else -> println("неопределенное значение")
    }

}