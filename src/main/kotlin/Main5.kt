import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val df = java.text.DecimalFormat("#.00")
    var saldoAtual = 0.0

    while (true) {
        if (scanner.hasNextDouble()) {
            val valor = scanner.nextDouble()

            if (valor > 0) {
                saldoAtual += valor
                println("Deposito realizado com sucesso!")
                println("Saldo atual: R$ ${df.format(saldoAtual)}")
            } else if (valor == 0.0) {
                println("Encerrando o programa...")
                break
            } else {
                println("Valor invalido! Digite um valor maior que zero.")
            }
        } else {
            break
        }
    }

    scanner.close()
}