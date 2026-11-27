package aula06

// Tema: classes, data class, enum, sealed class, object e companion object

class Pessoa(val nome: String, var idade: Int) {
    fun aniversario() {
        idade++
    }

    override fun toString() = "Pessoa(nome=$nome, idade=$idade)"
}

// data class: gera equals, hashCode, toString e copy automaticamente
data class Produto(val nome: String, val preco: Double, val estoque: Int = 0)

enum class Nivel(val pontos: Int) {
    BASICO(10), INTERMEDIARIO(20), AVANCADO(30)
}

// sealed class: conjunto fechado de tipos. Otima com when.
sealed class Resultado {
    data class Sucesso(val valor: Int) : Resultado()
    data class Erro(val mensagem: String) : Resultado()
}

fun dividir(a: Int, b: Int): Resultado =
    if (b == 0) Resultado.Erro("Divisao por zero") else Resultado.Sucesso(a / b)

// object: singleton
object Contador {
    private var total = 0
    fun incrementa() = ++total
}

class Conta(val titular: String) {
    companion object {
        const val TAXA = 0.02
        fun criaConta(titular: String) = Conta(titular)
    }
}

data class Aluno(val nome: String, val notas: List<Double>) {
    fun media(): Double = if (notas.isEmpty()) 0.0 else notas.average()
}

fun main() {
    val p = Pessoa("Lucas", 20)
    p.aniversario()
    println(p)

    val a = Produto("Camiseta", 49.9)
    val b = a.copy(preco = 39.9)
    println(a)
    println(b)
    println(a == a.copy()) // é true, data class vai compara atraves do conteudo

    println(Nivel.AVANCADO.pontos)
    println(Nivel.entries.map { it.name })

    for (r in listOf(dividir(10, 2), dividir(1, 0))) {
        when (r) { // OBS: sem else o compilador sabe todos os casos
            is Resultado.Sucesso -> println("Deu ${r.valor}")
            is Resultado.Erro -> println("Erro: ${r.mensagem}")
        }
    }

    Contador.incrementa()
    println(Contador.incrementa())
    println(Conta.criaConta("Ana").titular + " | taxa " + Conta.TAXA)

    // EXERCICIO: crie uma data class Aluno(nome, notas: List<Double>)
    // com um metodo media() e imprima os alunos aprovados (media >= 7).
    val alunos = listOf(
        Aluno("Ana", listOf(8.0, 9.0, 7.5)),
        Aluno("Bruno", listOf(5.5, 6.0, 6.5)),
        Aluno("Carla", listOf(7.0, 7.0, 7.0))
    )

    val aprovados = alunos.filter { it.media() >= 7.0 }
    aprovados.forEach { aluno ->
      println("Aprovado: ${aluno.nome} (media: ${"%.2f".format(aluno.media())})")
    }
    
}
