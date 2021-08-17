import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val list: MutableList<String> = ArrayList()
    for (i in 0..9) list.add(sc.next())
    val country = sc.next()
    if (list.contains(country)) println("$country ${list.indexOf(country)}") else println("Country not found")
}