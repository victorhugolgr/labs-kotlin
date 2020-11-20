fun main() {
    println("Olá mundo!")

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

class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set


    fun deposita(valor: Double) {
        if(valor > 0){
            this.saldo += valor
        }
    }

    fun saca(valor: Double){
        if(this.saldo >= valor){
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if(saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}



fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}

fun testaLacos(){
    for (i in 5 downTo 1 step 2) {

        if(i==4){
            break
        }
        val titular = "Victor $i"
        val numeroConta = 10 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println("")
    }
}