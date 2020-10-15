package Ex1_1
fun main() {
    println("Введите сумму перевода ")

    var amount: Int
    val sum = readLine()!!.toInt()
    amount = (sum * 100 * 0.0075).toInt()


    when {
        amount < 3500 -> {
             amount = sum * 100 + 3500
         }
        else -> {
            amount += sum * 100
        }
    }
    print(println("При переводе ${sum * 100}  коп. перевод с коммисией $amount  коп."))

}
