/**
 * data class란?
 * toString(), hashCode(), equals(), copy()메소드를 자동으로 만들어주는 클래스.
 */

data class Text(
    var text: String = "hello world"
)

fun main(args: Array<String>) {

    // var
    // val(상수)

    //   자바                 코틀린
    // int message  --> var message: 타입? = ( ? : ?가있으면 null허용, 없으면 null 허용X)
    var message: Text? = Text();

    // ?.let
    // message가 null이 아니면 ~해라.
    message?.let{
        println("Message: ${it.text}")
    }

    when(message){
        // null이면 println해라.
        null -> println("message is null")
        else-> println("message is not null")
    }

    var m = if (message == null){
        5
    } else {
        0
    }

    println(m)
}