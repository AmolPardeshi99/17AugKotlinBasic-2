import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    var year = scanner.nextInt()
    if ((year%4==0)&&(year%100!=0) || year%400==0) println("LEAP YEAR") else println("NOT LEAP YEAR")
    year = scanner.nextInt()
    if ((year%4==0)&&(year%100!=0) || year%400==0) println("LEAP YEAR") else println("NOT LEAP YEAR")
}