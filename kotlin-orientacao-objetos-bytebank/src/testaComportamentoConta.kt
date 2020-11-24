fun testaComportamentosConta() {
    val contaVictor = Conta(titular = "Victor", numero = 2);

    println(contaVictor.titular);

    val contaJaque = Conta(titular = "Jaque", numero = 1);
    contaJaque.deposita(2000.0)
    println(contaJaque.titular);

    println("Depositando na conta do victor")
    contaVictor.deposita(200.0)
    println(contaVictor.saldo)


    println("Sancando da conta do Victor")
    contaVictor.saca(100.0)
    println(contaVictor.saldo)

    println("Sancando da conta do Victor")
    contaVictor.saca(150.0)
    println(contaVictor.saldo)

    println("Tranferindo")
    contaJaque.transfere(valor = 100.0, destino = contaVictor)
    println(contaVictor.saldo)
    println(contaJaque.saldo)
}