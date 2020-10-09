package Ex1_2

fun main(){
    println("Введите число лайков")
    var likes = readLine()!!.toInt()

    likesFun(likes)
}

fun likesFun(likes : Int) {
    if ( ((likes % 10) == 1) && ((likes !== 11) && (likes % 10 != 11))){
        print("Понравилось " + likes + " человеку.")
    }else if (((likes % 10 >= 1) && (likes % 10 <= 9)) || (likes % 10 == 0)) {
        print("Понравилось " + likes + " людям.")
    }
}