import java.util.*
import kotlin.collections.LinkedHashMap

fun main() {
    var sc = Scanner(System.`in`)
    var str = sc.nextLine()
    str = str.replace(" ","")
    val hm = LinkedHashMap<Char, Int>()
    val strArr = str.toCharArray()
    for (ch in strArr) {
        if (hm.containsKey(ch)) {
            hm[ch] = hm.getValue(ch)+1
        } else hm[ch] = 1
    }
    for ((key, value) in hm) {
        println("$key - $value")
    }



}