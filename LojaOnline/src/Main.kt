import java.sql.Array

fun main() {
    val produto = arrayOfNulls<Produto>(3)
    produto[0] = Produto("Smarthphone1",1800.0,12)
    produto[1] = Produto("Smarthphone2",3200.0,6)
    produto[2] = Produto("Smarthphone3",4800.0,8)

    produto[0]?.prdctStatus()
    produto[1]?.prdctStatus()
    produto[2]?.prdctStatus()
}