
fun main(args: Int) {
        print(NumberEnum1.valueOf("hello"))
    }

enum class NumberEnum1(val value:String) {
    WIFI("hello"),
    ENTERTAINMENT("hi"),
    UNKNOWN("Unknown"),
}