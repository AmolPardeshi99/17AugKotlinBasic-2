import kotlin.collections.last as last1

fun main() {
    val array = arrayOf<String>("HTML", "CSS", "JAVA", "JS", "ANDROID")
    var sum =0;
    for (i in array.indices){
           sum += array[i].length;
    }
    println("Total Characters are $sum")
}