import java.util.*

class Produto(var nome: String, var preco: Double, var estq: Int) {

    fun prdctStatus() {
        println("-----Status do Produto-----\nNome: $nome\nPreco: R$ $preco\nEstoque: $estq")
        var totEstq:Double= preco*estq
        println("Valor total do estoque: R$ $totEstq")
    }

    fun registerPrdct() {
        var scan = Scanner(System.`in`)

        println("-----Editar Produto-----\nInsira o nome do produto:")
        nome = scan.nextLine()
        println("Insira valor do produto:")
        preco = scan.nextDouble()
        println("Insira a quantidade de produtos:")
        estq = scan.nextInt()
        println("-----Edição realizada com sucesso-----")
    }

}