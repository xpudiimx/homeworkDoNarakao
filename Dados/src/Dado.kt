import java.util.*

class Dado {

    fun jogarDado(){
        fun IntRange.random() =
            Random().nextInt((endInclusive + 1) - start) + start
        var n = (1..6).random()

        println("Jogando dado...")
        println("Resultado ${n}")
    }
}