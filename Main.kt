

fun main(args: Array<String>) {

    println("숫자를 입력해주세요.")
    var number1 = readLine()!!.toInt()

    println("연산자를 넣어주세요(+, -, /, *)")
    val operator = readLine()!!.toString()

    println("숫자를 입력해주세요.")
    var number2 = readLine()!!.toInt()

    var calculator = Calculator()
    var result = calculator.operator(number1, number2, operator)

    println("답은 ${result}입니다.")


}