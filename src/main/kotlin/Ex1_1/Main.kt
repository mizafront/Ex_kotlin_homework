package Ex1_1
fun main() {
    println("Введите сумму перевода ")

    var amount: Int
    val sum = readLine()!!.toInt()

    when {
        sum < 35 -> {  // Проверка на перевод, если меньше 35р. то коммисия 35р, иначе 0.75%
             amount = sum * 100 + 3500
         }
        else -> {
            amount = (sum * 100 * 0.0075).toInt()
            amount += sum * 100
        }
    }
    print(println("При переводе ${sum * 100}  коп. перевод с коммисией $amount  коп."))

}
