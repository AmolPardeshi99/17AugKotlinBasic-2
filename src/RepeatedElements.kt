fun main() {
    val arr = intArrayOf(20, -20, 30, 20, 50)
    PrintRepeated(arr)
}

fun PrintRepeated(arr: IntArray) {
    for (i in arr.indices) {
        for (j in i + 1 until arr.size)
            if (arr[i] == arr[j]) {
                print("" + arr[i] + ", ")
            }
    }
}