package aula05

// Tema: List, Set, Map e operacoes funcionais (filter, map, groupBy...)

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // OBS: imutavel
    val mutavel = mutableListOf("a", "b")
    mutavel.add("c")

    println(numeros.filter { it % 2 == 0 })
    println(numeros.map { it * it })
    println(numeros.sum())
    println(numeros.any { it > 9 })
    println(numeros.all { it > 0 })
    println(numeros.firstOrNull { it > 100 })
    println(numeros.take(3))

    // Encadeando operacoes
    val resultado = numeros
        .filter { it % 2 == 1 }
        .map { it * 10 }
        .reduce { acc, n -> acc + n }
    println("Resultado: $resultado")

    // Set: sem repeticoes
    val unicos = setOf(1, 2, 2, 3, 3, 3)
    println(unicos)

    // Map
    val idades = mapOf("Ana" to 25, "Bruno" to 31, "Carla" to 25)
    for ((nome, idade) in idades) println("$nome tem $idade")
    println(idades["Ana"])
    println(idades.getOrDefault("Diego", -1))

    // groupBy
    val porIdade = idades.entries.groupBy({ it.value }, { it.key })
    println(porIdade)

    // sorted, joinToString
    val palavras = listOf("kotlin", "java", "go", "rust")
    println(palavras.sortedBy { it.length }.joinToString(", "))

    // EXERCICIO: dada uma lista de palavras, conte quantas vezes cada
    // uma aparece (dica: groupingBy { it }.eachCount()).
    val palavrasRepetidas = listOf("kotlin", "java", "kotlin", "go", "java", "kotlin")
    val frequencia = palavrasRepetidas.groupingBy { it }.eachCount()
    
    println("Frequencia: $frequencia")
    
}
