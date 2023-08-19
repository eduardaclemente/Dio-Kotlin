fun main() {
    // Entrada de dados
    val saldoTotal = readLine() !!.toInt()
    val valorSaque = readLine() !!.toInt()

    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    if (valorSaque <= saldoTotal) {
        val novoSaldo = saldoTotal - valorSaque
        println("Saque realizado com sucesso. Novo saldo: $novoSaldo")
    } else {
        println("Saldo insuficiente. Saque nao realizado!")
    }
}