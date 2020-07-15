package com.silang.kotlinlib

class MyClass {
}


class Comparable<in T> {
    var  a = 1;
    fun compareTo(other: T): Int{
        return 1
    }
}
fun demo(x: Comparable<Number>) {
    x.compareTo(1.0) // 1.0 拥有类型 Double，它是 Number 的子类型
    x.a = 2
    // 因此，我们可以将 x 赋给类型为 Comparable <Double> 的变量

    val y: Comparable<Double> = x // OK！

    print("'************'${x.a}")
}

fun main() {
    var  c = Comparable<Number>();
    demo(c)
}