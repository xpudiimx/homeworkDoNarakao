import java.util.*

class Produto(var nome: String, var preco: Double, var estq: Int) {

    fun prdctStatus() {
        println("-----Status do Produto-----\nNome: $nome\nPreco: R$ $preco\nEstoque: $estq Unidades")
        var totEstq:Double= preco*estq
        println("Valor total do estoque: R$ $totEstq")
    }

    fun menuPrdct() {
        var scan = Scanner(System.`in`)

        println("-----Menu do Produto-----")
        println("1. Editar nome\n2. Editar valor\n3. Editar quantidade\n4. Status do produto\n0. Sair da edicao\n\n-Selecione uma opcao")
        var select = scan.nextInt()

        if (select == 1) {
            println("Insira o nome do produto:")
            if (scan.nextLine() != "") {
                scan.nextLine()
            }
            nome = scan.nextLine()
            println("-----Edicao realizada com sucesso-----")
            println("\n\n1. Retornar ao menu principal\n0. Sair da edicao")
            select = scan.nextInt()
            if (select == 1){
                menuPrdct()
            }else if (select == 0){
                System.exit(0)
            }
        }else if (select == 2){
            println("Insira valor do produto:")
            preco = scan.nextDouble()
            println("-----Edicao realizada com sucesso-----")
            println("\n\n1. Retornar ao menu principal\n0. Sair da edicao")
            select = scan.nextInt()
            if (select == 1){
                menuPrdct()
            }else if (select == 0){
                System.exit(0)
            }
        }else if (select == 3){
            println("Insira a quantidade de produtos:")
            estq = scan.nextInt()
            println("-----Edicao realizada com sucesso-----")
            println("\n\n1. Retornar ao menu principal\n0. Sair da edicao")
            select = scan.nextInt()
            if (select == 1){
                menuPrdct()
            }else if (select == 0){
                System.exit(0)
            }
        }else if (select == 4){
            prdctStatus()
            println("\n\n1. Retornar ao menu principal\n0. Sair da edicao")
            select = scan.nextInt()
            if (select == 1){
                menuPrdct()
            }else if (select == 0){
                System.exit(0)
            }
        } else if (select == 0){
            return
        }



    }

}