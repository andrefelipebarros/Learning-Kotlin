package aula04

// Tema: null safety. Um dos grandes diferenciais do Kotlin.
// Tipo com ? pode ser null. Tipo sem ? nunca pode.(engraçado eu sei, quando tava lendo tbm achei)

fun tamanhoDoNome(nome: String?): Int {
    return nome?.length ?: 0 // ?. chamada segura, ?: valor padrao (Elvis Presley)
}

fun buscaUsuario(id: Int): String? =
    if (id == 1) "Andre" else null

fun formatarTextoOuVazio(texto: String?): String =
    texto?.takeIf { it.isNotBlank() }?.uppercase() ?: "(vazio)"

fun main() {
    var nome: String? = "Kotlin"
    println(nome?.uppercase())
    nome = null
    println(nome?.uppercase()) // imprime null, sem erro
    println(tamanhoDoNome(nome))

    // let: executa o bloco so se nao for null
    buscaUsuario(1)?.let { println("Achei: $it") }
    buscaUsuario(2)?.let { println("Achei: $it") } ?: println("Usuario 2 nao existe")

    // Smart cast apos verificar null
    val talvez: String? = "oi"
    if (talvez != null) {
        println(talvez.length) // aqui o compilador sabe que nao e null
    }

    // OBS: forca o valor e lanca excecao se for null. Evite:
    // val perigo = buscaUsuario(2)

    // Conversao segura
    println("123".toIntOrNull())
    println("abc".toIntOrNull())

    // EXERCICIO: escreva uma funcao que recebe String? e devolve o texto
    // em maiusculas, ou "(vazio)" se for null ou em branco.
    println(formatarTextoOuVazio("kotlin"))
    println(formatarTextoOuVazio("   "))
    println(formatarTextoOuVazio(null))
}
