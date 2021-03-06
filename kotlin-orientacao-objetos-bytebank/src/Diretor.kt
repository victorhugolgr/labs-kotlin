class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Int
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

    override val bonificacao: Double get() = super.bonificacao + salario + plr
}