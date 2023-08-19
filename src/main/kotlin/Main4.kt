import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val df = DecimalFormat("#.00")

    val valorInicial = scanner.nextDouble()
    val taxaJuros = scanner.nextDouble()
    val periodo = scanner.nextInt()

    var valorFinal = valorInicial

    // Iterar, baseado no período em anos, para cálculo do valorFinal com os juros.
    for (ano in 1..periodo) {
        valorFinal += valorFinal * taxaJuros
    }

    println("Valor final do investimento: R$ ${df.format(valorFinal)}")

    scanner.close()
}