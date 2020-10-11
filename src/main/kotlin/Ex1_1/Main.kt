package Ex1_1
fun main() {
    println("Введите сумму перевода (От 35р.)")

    var amount: Int
    val input = readLine()!!.toInt()

    if ((input * 100 ) < 3500){
        amount = input * 100 + 3500
    }else{
        amount = (input * 100 * 0.075).toInt()
        amount += input * 100
    }
    print(println("При переводе ${input * 100}  коп. перевод с коммисией $amount  коп."))

}
