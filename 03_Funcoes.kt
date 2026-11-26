package aula03

// Tema: funcoes, argumentos padrao, nomeados, vararg e extension functions

fun soma(a: Int, b: Int): Int = a + b // funcao de uma expressao

fun saudacao(nome: String, saudacao: String = "Ola", exclamacao: Boolean = true): String {
    val fim = if (exclamacao) "!" else "."
    return "$saudacao, $nome$fim"
}

fun media(vararg valores: Double): Double =
    if (valores.isEmpty()) 0.0 else valores.sum() / valores.size

// Funcao de extensao responsável por adicionar um metodo a um tipo existente
fun String.invertida(): String = this.reversed()

fun Int.ehPrimo(): Boolean {
    if (this < 2) return false
    for (i in 2..Math.sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}

fun Int.fatorial(): Long {
    require(this >= 0) { "Fatorial nao definido para numeros negativos: $this" }
    var resultado = 1L
    for (i in 2..this) {
        resultado *= i
    }
    return resultado
}

// Retornando varios valores com Pair
fun minEMax(lista: List<Int>): Pair<Int, Int> = Pair(lista.min(), lista.max())

fun main() {
    println(soma(2, 3))
    println(saudacao("Maria"))
    println(saudacao("Joao", exclamacao = false)) // argumento nomeado
    println(saudacao(saudacao = "Fala", nome = "Ana"))
    println(media(7.0, 8.5, 10.0))
    println("kotlin".invertida())
    println(17.ehPrimo())

    val (menor, maior) = minEMax(listOf(4, 9, 1, 12, 7)) // desestruturacao
    println("Menor: $menor, maior: $maior")

    // EXERCICIO: crie a extension function Int.fatorial() e imprima 5.fatorial().
    println(5.fatorial()) // 120 (foi easy)
}
