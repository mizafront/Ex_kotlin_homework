package Ex1_1
fun main() {
    println("Введите сумму перевода (От 35р.)")

    var amount = 0
    var input = readLine()!!.toInt()

    if (input > 35 ) {
        println("Минимальная сумма перевода 35р.")
    } else {
        input = input * 100
        amount = (input * 100 * 0.075).toInt()
        println("При переводе " + input + " к. с коммисией " + amount)
    }
}
