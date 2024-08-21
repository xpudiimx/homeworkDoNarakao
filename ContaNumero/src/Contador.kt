class Contador {

    fun contaNum(){
        var a = 0
        var b = 0
        for (i in 1..50){
            println(i)
            if (i % 2 == 0){
                a++
            }else{
                b++
            }
        }
        println("${a} números pares")
        println("${b} números pares")
    }
}