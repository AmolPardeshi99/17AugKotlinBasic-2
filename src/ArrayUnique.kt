import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    while (true) {
        var str = sc.nextLine()
        val hm = LinkedHashMap<String, Int>()
        val strArr = str.split(" ".toRegex()).toTypedArray()
        for (ch in strArr) {
                if (hm.containsKey(ch)) {
                    hm[ch] = hm[ch]!! + 1
                } else hm[ch] = 1
        }
        for ((key, value) in hm) {
            if (value == 1) print("$key ")
        }
    }
}