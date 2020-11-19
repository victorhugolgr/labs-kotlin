fun main(){
    println("Olá mundo!")
    val titular = "Victor"
    val numeroConta = 10
    var saldo = 0.0
    saldo = 100.0 + 200
    saldo += 1000

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")

    saldo = -10.0;

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}