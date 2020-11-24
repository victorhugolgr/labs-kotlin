fun main() {
    val alex = Funcionario(
        nome = "Alex",
        cpf = "1111111",
        salario = 1_000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salrio ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")
}







