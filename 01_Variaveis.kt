package aula01

// Tema: variaveis, tipos basicos e string templates.
// val = imutavel (nao pode ser reatribuida), var = mutavel.

fun main() {
    val nome = "Andre"
    var idade = 22
    idade += 1 // ok é uma var

    val altura: Double = 1.78 // tipo explicito
    val ativo = true // tipo inferido: Boolean
    val inicial: Char = nome[0]
    val grande = 1_000_000L // Long com separador para ler melhor

    // String template: use $variavel ou ${expressao}
    println("Nome: $nome, idade: $idade")
    println("Daqui a 5 anos: ${idade + 5}")
    println("Inicial: $inicial | altura: $altura | ativo: $ativo | grande: $grande")

    // Conversoes é explicita
    val inteiro = 10
    val decimal = inteiro.toDouble() / 3
    println("10 / 3 = %.2f".format(decimal))

    // String multilinha
    val texto = """
        Linha 1
        Linha 2
    """.trimIndent()
    println(texto)

    // EXERCICIO: crie variaveis com seu nome, cidade e ano de nascimento
    // e imprima "Eu sou X, de Y, e tenho Z anos" calculando a idade.
    val meuNome = "Andre"
    val cidade = "Rio de Janeiro"
    val anoNascimento = 2004
    val anoAtual = 2026
    val idadeCalculada = anoAtual - anoNascimento

    println("Eu sou $meuNome, de $cidade, e tenho $idadeCalculada anos")
}
