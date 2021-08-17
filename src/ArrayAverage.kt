fun main() {
    val arr = intArrayOf()
    val arr1 = intArrayOf(1, 2, 3, 4, 5)
    val arr2 = intArrayOf(-12, -39, 12, 41, 22, 44)
    findAverage(arr)
    findAverage(arr1)
    findAverage(arr2)
}

fun findAverage(arr: IntArray) {
    var average = 0
    if (arr.isNotEmpty()) {
        for (i in arr.indices) average += arr[i]
        if (average < 1) {
            average /= arr.size
        }
    }
    println("Average of " + arr.contentToString() + " is  $average")
}