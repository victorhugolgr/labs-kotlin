fun main() {
    val victor = Gerente(
        nome = "Alex",
        cpf = "1111111",
        salario = 1_000.0,
        senha = 1
    )

    val jaque = Funcionario(
        nome = "Jaque",
        cpf = "22222",
        salario = 900.0
    )

    val roberto = Diretor(
        nome = "Roberto",
        senha = 1,
        cpf = "33333",
        salario = 3_000.0,
        plr = 200
    )




    val calculadora = CalculadoraBonificacao()
    calculadora.registra(victor)
    calculadora.registra(jaque)
    calculadora.registra(roberto)

    println("Total de bonificação : ${calculadora.total}")
}







