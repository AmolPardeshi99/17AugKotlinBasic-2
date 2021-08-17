import java.util.*

fun main() {
    var sc = Scanner(System.`in`)
    val starting  = sc.nextInt()
    val decrement = sc.nextInt()
    for (i in starting downTo 0 step decrement ) println(i)
}