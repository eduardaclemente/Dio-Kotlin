fun main() {
    val saldoAtual = readLine()!!.toFloat()
    val valorDeposito = readLine()!!.toFloat()
    val valorRetirada = readLine()!!.toFloat()

    //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
    val saldoAtualizado = saldoAtual + valorDeposito - valorRetirada
    //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
    println("Saldo atualizado: ${"%.1f".format(saldoAtualizado)}")
}