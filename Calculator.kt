

class Calculator() {
    fun operator(number1:Int, number2:Int, operator: String) : Int {
        var add = AddOperation()
        var sub = SubstractOperation()
        var mul = MultiplyOperation()
        var divi = DivideOperation()

        var result = 0

        if( operator == "+") {
            result = add.operate(number1, number2)
        } else if( operator == "-") {
            result = sub.operate(number1, number2)
        } else if( operator == "*") {
            result = mul.operate(number1, number2)
        } else if( operator == "/") {
            result = divi.operate(number1, number2)
        } else {
            println("다시 입력해주세요.")
            0
        }
        return result
    }
}
