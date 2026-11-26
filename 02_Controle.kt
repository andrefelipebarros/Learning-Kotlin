package aula02

// Tema: if como expressao, when, for, while e ranges

fun classificaNota(nota: Int): String =
    when {
        nota >= 90 -> "A"
        nota >= 80 -> "B"
        nota >= 70 -> "C"
        else -> "Reprovado"
    }

fun nomeDoDia(dia: Int): String =
    when (dia) {
        1 -> "Domingo"
        2 -> "Segunda"
        3, 4, 5 -> "Meio da semana"
        6 -> "Sexta"
        7 -> "Sabado"
        else -> "Dia invalido"
    }

fun main() {
    // if e uma expressao que devolve valor
    val numero = 7
    val paridade = if (numero % 2 == 0) "par" else "impar"
    println("$numero e $paridade")

    println(classificaNota(85))
    println(nomeDoDia(4))

    // Ranges
    for (i in 1..5) print("$i ")
    println()
    for (i in 10 downTo 0 step 2) print("$i ")
    println()
    for (i in 0 until 5) print("$i ") // 'until' exclui o ultimo
    println()

    // while
    var contador = 3
    while (contador > 0) {
        println("Contagem: $contador")
        contador--
    }

    // Verificacao se pertence ou não
    val letra = 'k'
    println(if (letra in 'a'..'z') "minuscula" else "outra coisa")

    // EXERCICIO: escreva o FizzBuzz de 1 a 30 usando when.
    
    for (i in 1..30) {
        val resultado = when {
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i.toString()
        }
        println(resultado)
    }
}
