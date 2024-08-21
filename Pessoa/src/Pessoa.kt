class Pessoa(var nome: String, var idade: Int, var profissao: String) {
    //var nome: String
    //var idade: Int
    //var profissao: String

    override fun toString(): String {
        return "Dados\nnome: $nome\nIdade: $idade\nProfissão: $profissao"
    }


}