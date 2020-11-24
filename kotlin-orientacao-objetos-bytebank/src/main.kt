fun main() {

    val contaCorrente = ContaCorrente(
        titular = "Victor",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Jaque",
        numero = 2000
    )

    contaCorrente.deposita(1000.0);
    contaPoupanca.deposita(1000.0);

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupanca: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupanca: ${contaPoupanca.saldo}")
}







