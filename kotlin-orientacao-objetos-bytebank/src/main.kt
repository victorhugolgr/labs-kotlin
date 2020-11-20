fun main() {
    println("Olá mundo!")

    val contaVictor = Conta();
    contaVictor.titular = "Victor";

    println(contaVictor.titular);

    val contaJaque = Conta();
    contaJaque.titular = "Jaque";
    contaJaque.setSaldo(2000.0)
    println(contaJaque.titular);

    println("Depositando na conta do victor")
    contaVictor.deposita(200.0)
    println(contaVictor.getSaldo())


    println("Sancando da conta do Victor")
    contaVictor.saca(100.0)
    println(contaVictor.getSaldo())

    println("Sancando da conta do Victor")
    contaVictor.saca(150.0)
    println(contaVictor.getSaldo())

    println("Tranferindo")
    contaJaque.transfere(100.0, contaVictor)
    println(contaVictor.getSaldo())
    println(contaJaque.getSaldo())

}

class Conta {
    var titular = "";
    var numero = 0;
    private var saldo = 0.0;

    fun deposita(valor: Double) {
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
            destino.deposita(valor)
            return true
        }
        return false
    }

    fun getSaldo(): Double{
        return saldo
    }

    fun setSaldo(saldo: Double){
        this.saldo = saldo
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