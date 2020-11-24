class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    fun autenticacao(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}