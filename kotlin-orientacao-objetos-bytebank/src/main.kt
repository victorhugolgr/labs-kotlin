fun main() {
    println("Olá mundo!")

    val conta = Conta();
    conta.titular = "Victor";

    println(conta.titular);

    val contaJaque = Conta();
    contaJaque.titular = "Jaque";
    println(contaJaque.titular);
}

class Conta {
    var titular = "";
    var numero = 0;
    var saldo = 0.0;
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