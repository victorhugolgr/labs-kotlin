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