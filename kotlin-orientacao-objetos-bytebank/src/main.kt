fun main() {
    println("Olá mundo!")

    val conta = Conta();
    conta.titular = "Victor";

    println(conta.titular);

    val contaJaque = Conta();
    contaJaque.titular = "Jaque";
    contaJaque.saldo = 2000.0
    println(contaJaque.titular);

    println("Depositando na conta do victor")
    conta.depositar(200.0)
    println(conta.saldo)


    println("Sancando da conta do Victor")
    conta.saca(100.0)
    println(conta.saldo)

    println("Sancando da conta do Victor")
    conta.saca(150.0)
    println(conta.saldo)

    println("Tranferindo")
    contaJaque.transfere(100.0, conta)
    println(conta.saldo)
    println(contaJaque.saldo)

}

class Conta {
    var titular = "";
    var numero = 0;
    var saldo = 0.0;

    fun depositar(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double){
        if(this.saldo >= valor){
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if(saldo >= valor) {
            saldo -= valor
            destino.depositar(valor)
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